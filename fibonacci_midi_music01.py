import pygame.midi
import time
import random

# フィボナッチ数列を生成する関数
def fib2(n, a=1, b=0):
    if n == 0:
        return b
    elif n == 1:
        return a
    else:
        return fib2(n - 1, a + b, a)

# フィボナッチ数列を MIDI ノート番号に変換
def fibonacci_to_midi(n_terms):
    midi_notes = []
    for i in range(n_terms):
        fib_value = fib2(i)
        # MIDIノート番号は21 (A0) ～ 108 (C8)に収める
        midi_note = 21 + (fib_value % 87)  # % 87 で範囲を制限
        midi_notes.append((midi_note, fib_value))
    return midi_notes

# MIDI 再生用の関数
def play_fibonacci_midi_random(n_terms, device_id, duration=180):
    # Pygame MIDI 初期化
    pygame.midi.init()

    # MIDI デバイス確認
    device_count = pygame.midi.get_count()
    if device_count == 0:
        print("No MIDI devices found.")
    else:
        print(f"{device_count} MIDI devices found.")
        
    try:
        # 出力デバイスを選択
        player = pygame.midi.Output(device_id)
        player.set_instrument(41)  # バイオリン音

        # フィボナッチ数列を生成
        midi_notes = fibonacci_to_midi(n_terms)

        # 再生開始
        start_time = time.time()
        while time.time() - start_time < duration:  # 指定時間まで再生
            midi_note, fib_value = random.choice(midi_notes)  # ランダムに選択
            print(f"Playing note: {midi_note} (Fibonacci term: {fib_value})")
            player.note_on(midi_note, random.randint(100, 127))  # ランダムな音量
            time.sleep(random.uniform(0.2, 0.5))  # ランダムな再生間隔
            player.note_off(midi_note, 127)

    except Exception as e:
        print(f"Error: {e}")
    finally:
        # クリーンアップ
        player.close()
        pygame.midi.quit()

# メイン処理
if __name__ == "__main__":
    # 使用可能なデバイス ID を確認済みの場合、適切な ID を設定
    output_device_id = 2  # MIDI 出力デバイス ID を指定
    num_terms = 50        # フィボナッチ数列の項数
    duration = 180        # 再生時間（秒）

    play_fibonacci_midi_random(num_terms, output_device_id, duration)

