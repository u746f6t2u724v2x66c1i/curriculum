import pygame.midi
import time
import random

# トライアングル数列を生成する関数
def generate_triangle_numbers(limit):
    triangle_numbers = []
    for n in range(1, limit + 1):
        triangle_number = n * (n + 1) // 2  # トライアングル数列のn番目の数
        triangle_numbers.append(triangle_number)
    return triangle_numbers

# トライアングル数列をMIDIノートに変換する関数
def triangle_to_midi(triangle_numbers, min_note=21, max_note=108):
    midi_notes = []
    for num in triangle_numbers:
        # トライアングル数をMIDIノート番号の範囲にマッピング
        midi_note = min_note + (num % (max_note - min_note + 1))
        midi_notes.append(midi_note)
    return midi_notes

# MIDI再生関数
def play_triangle_midi(triangle_numbers, device_id, duration=180):
    pygame.midi.init()

    try:
        # 出力デバイスを選択
        player = pygame.midi.Output(device_id)
        player.set_instrument(41)  # バイオリン音

        # トライアングル数列をMIDIノートに変換
        midi_notes = triangle_to_midi(triangle_numbers)
        
        start_time = time.time()
        while time.time() - start_time < duration:
            for midi_note in midi_notes:
                print(f"Playing note: {midi_note}")
                player.note_on(midi_note, 127)  # 音を鳴らす
                time.sleep(random.uniform(0.2, 0.5))  # ランダムな再生間隔
                player.note_off(midi_note, 127)  # 音を止める

    finally:
        # クリーンアップ
        player.close()
        pygame.midi.quit()

# メイン処理
if __name__ == "__main__":
    # 使用可能なデバイス ID を確認済みの場合、適切な ID を設定
    output_device_id = 2  # MIDI出力デバイス ID を指定
    num_terms = 100        # トライアングル数列の項数

    # トライアングル数列を生成
    triangle_numbers = generate_triangle_numbers(num_terms)

    # 音楽を再生（3分間）
    play_triangle_midi(triangle_numbers, output_device_id)

