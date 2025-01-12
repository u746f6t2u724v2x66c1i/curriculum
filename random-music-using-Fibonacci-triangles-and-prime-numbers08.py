import pygame.midi
import time
import random

# 数列を生成する関数
def generate_fibonacci(limit):
    fibonacci = [0, 1]
    while len(fibonacci) < limit:
        fibonacci.append(fibonacci[-1] + fibonacci[-2])
    return fibonacci

def generate_triangle(limit):
    triangle = []
    for n in range(1, limit + 1):
        triangle.append(n * (n + 1) // 2)
    return triangle

def generate_primes(limit):
    primes = []
    num = 2
    while len(primes) < limit:
        if all(num % p != 0 for p in primes):
            primes.append(num)
        num += 1
    return primes

# 数列をMIDIノートに変換する関数
def sequence_to_midi(sequence, min_note=21, max_note=108, offset=0):
    midi_notes = []
    for num in sequence:
        midi_note = min_note + (num % (max_note - min_note + 1)) + offset  # MIDIノート範囲にマッピング
        midi_notes.append(midi_note)
    return midi_notes

# 数列を使って音楽を再生する関数
def play_highlighted_triangle_music(fibonacci, triangle, primes, device_id, duration=1500):
    pygame.midi.init()

    try:
        # 出力デバイスを選択
        player = pygame.midi.Output(device_id)
        player.set_instrument(41)  # バイオリン音

        # 数列をMIDIノートに変換
        fibonacci_notes = sequence_to_midi(fibonacci, offset=12)  # フィボナッチは1オクターブ上
        triangle_notes = sequence_to_midi(triangle, offset=24)    # トライアングルは2オクターブ上
        prime_notes = sequence_to_midi(primes)                     # 素数はデフォルトのオクターブ

        start_time = time.time()
        while time.time() - start_time < duration:
            # トライアングル数列を際立たせる
            if random.random() < 0.7:  # 70%の確率でトライアングル数列を選択
                selected_sequence = triangle_notes
            else:
                selected_sequence = random.choice([fibonacci_notes, prime_notes])

            midi_note = random.choice(selected_sequence)
            print(f"Playing note: {midi_note}")

            # ノートの強さ（ベロシティ）をランダムに
            velocity = random.randint(80, 127)
            player.note_on(midi_note, velocity)  # 音を鳴らす

            # 数列に応じたランダムな再生間隔
            if selected_sequence == triangle_notes:
                time.sleep(random.uniform(0.4, 0.6))  # トライアングルは遅め
            else:
                time.sleep(random.uniform(0.2, 0.4))  # 他の数列は早め

            player.note_off(midi_note, velocity)  # 音を止める

            # 時々空白の音を止める時間をランダムに配置
            if random.random() < 0.1:  # 10%の確率で空白を挿入
                silence_duration = random.uniform(0.5, 1.5)
                print(f"Silence for {silence_duration} seconds")
                time.sleep(silence_duration)

    finally:
        # クリーンアップ
        player.close()
        pygame.midi.quit()

# メイン処理
if __name__ == "__main__":
    # 使用可能なデバイス ID を確認済みの場合、適切な ID を設定
    output_device_id = 2  # MIDI出力デバイス ID を指定
    num_terms = 50        # 数列の項数

    # 各数列を生成
    fibonacci = generate_fibonacci(num_terms)
    triangle = generate_triangle(num_terms)
    primes = generate_primes(num_terms)

    # 音楽を再生（3分間）
    play_highlighted_triangle_music(fibonacci, triangle, primes, output_device_id)





