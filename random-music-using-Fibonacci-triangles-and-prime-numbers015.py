import pygame.midi
import time
import random

# 数列生成関数
def generate_triangle(limit):
    return [n * (n + 1) // 2 for n in range(1, limit + 1)]

def generate_fibonacci(limit):
    sequence = [0, 1]
    while len(sequence) < limit:
        sequence.append(sequence[-1] + sequence[-2])
    return sequence

def generate_primes(limit):
    primes = []
    num = 2
    while len(primes) < limit:
        if all(num % p != 0 for p in primes):
            primes.append(num)
        num += 1
    return primes

# MIDIノートに変換
def sequence_to_midi(sequence, min_note=21, max_note=108, offset=0):
    return [min_note + (num % (max_note - min_note + 1)) + offset for num in sequence]

# メインの音楽再生関数
def play_music_with_beat(triangle, fibonacci, primes, device_id, bpm=120, duration=1500):
    pygame.midi.init()
    try:
        player = pygame.midi.Output(device_id)
        player.write_short(0xc0, 0)  # プログラムチェンジメッセージ（ピアノ）
        beat_interval = 60 / bpm  # 1拍の長さ

        triangle_notes = sequence_to_midi(triangle, offset=24)
        fibonacci_notes = sequence_to_midi(fibonacci, offset=12)
        prime_notes = sequence_to_midi(primes, offset=36)

        start_time = time.time()
        while time.time() - start_time < duration:
            beat_start = time.time()

            # 1拍目：トライアングル数列のメロディ
            triangle_note = random.choice(triangle_notes)
            velocity = random.randint(100, 127)
            player.note_on(triangle_note, velocity)
            time.sleep(beat_interval * 0.8)  # 短めの音
            player.note_off(triangle_note, 0)

            # 2拍目：和音（フィボナッチ数列を使ったベースライン）
            if random.random() < 0.5:
                fibonacci_note = random.choice(fibonacci_notes)
                chord = [fibonacci_note, fibonacci_note + 7, fibonacci_note + 12]  # ベースラインの和音
                for note in chord:
                    player.note_on(note, velocity - 20)
                time.sleep(beat_interval)
                for note in chord:
                    player.note_off(note, 0)

            # 3拍目：リズム（素数列を使ったアクセント）
            if random.random() < 0.5:
                prime_note = random.choice(prime_notes)
                player.note_on(prime_note, velocity - 30)
                time.sleep(beat_interval * 0.6)
                player.note_off(prime_note, 0)

            # 4拍目：短い装飾音（素数またはトライアングル数列から選択）
            decoration_note = random.choice(triangle_notes + prime_notes)
            player.note_on(decoration_note, velocity - 40)
            time.sleep(beat_interval * 0.4)
            player.note_off(decoration_note, 0)

            # 次の拍まで待機
            elapsed = time.time() - beat_start
            if elapsed < beat_interval:
                time.sleep(beat_interval - elapsed)

    finally:
        player.close()
        pygame.midi.quit()

# メイン処理
if __name__ == "__main__":
    output_device_id = 2  # 使用するMIDIデバイスID
    num_terms = 50        # 数列の項数

    triangle = generate_triangle(num_terms)
    fibonacci = generate_fibonacci(num_terms)
    primes = generate_primes(num_terms)

    play_music_with_beat(triangle, fibonacci, primes, output_device_id, bpm=140, duration=1500)

