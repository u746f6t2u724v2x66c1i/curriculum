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
def play_random_music(fibonacci, triangle, primes, device_id, duration=180):
    pygame.midi.init()

    try:
        # 出力デバイスを選択
        player = pygame.midi.Output(device_id)
        player.set_instrument(0)  # ピアノ音

        # 数列をMIDIノートに変換
        fibonacci_notes = sequence_to_midi(fibonacci, offset=12)  # フィボナッチは1オクターブ上
        triangle_notes = sequence_to_midi(triangle, offset=24)    # トライアングルは2オクターブ上
        prime_notes = sequence_to_midi(primes)                     # 素数はデフォルトのオクターブ

        start_time = time.time()
        while time.time() - start_time < duration:
            # 3つの数列からランダムに選んで再生
            selected_sequence = random.choice([fibonacci_notes, triangle_notes, prime_notes])
            midi_note = random.choice(selected_sequence)
            print(f"Playing note: {midi_note}")

            # ノートの強さ（ベロシティ）をランダムに
            velocity = random.randint(80, 127)
            player.note_on(midi_note, velocity)  # 音を鳴らす

            # 数列に応じたランダムな再生間隔
            if selected_sequence == fibonacci_notes:
                time.sleep(random.uniform(0.2, 0.4))  # フィボナッチは早め
            elif selected_sequence == triangle_notes:
                time.sleep(random.uniform(0.4, 0.6))  # トライアングルは遅め
            else:
                time.sleep(random.uniform(0.3, 0.5))  # 素数は中くらい

            player.note_off(midi_note, velocity)  # 音を止める

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
    play_random_music(fibonacci, triangle, primes, output_device_id)


