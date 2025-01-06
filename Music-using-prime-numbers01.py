import pygame.midi
import time
import random

# 素数を生成する関数
def generate_primes(limit):
    primes = []
    num = 2  # 最初の素数
    while len(primes) < limit:
        for i in range(2, int(num ** 0.5) + 1):
            if num % i == 0:
                break
        else:
            primes.append(num)
        num += 1
    return primes

# 素数を MIDI ノートに変換する関数
def primes_to_midi(primes, min_note=21, max_note=108):
    midi_notes = []
    for prime in primes:
        # 素数を MIDI ノート番号の範囲にマッピング
        midi_note = min_note + (prime % (max_note - min_note + 1))
        midi_notes.append(midi_note)
    return midi_notes

# MIDI 再生関数
def play_prime_midi(primes, device_id, duration=180):
    # Pygame MIDI 初期化
    pygame.midi.init()

    try:
        # 出力デバイスを選択
        player = pygame.midi.Output(device_id)
        player.set_instrument(41)  # バイオリン音

        # 素数を MIDI ノートに変換
        midi_notes = primes_to_midi(primes)

        # 再生開始
        start_time = time.time()
        while time.time() - start_time < duration:  # 指定時間まで再生
            midi_note = random.choice(midi_notes)  # ランダムに選択
            print(f"Playing note: {midi_note}")
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
    # 使用可能なデバイス ID を確認
    pygame.midi.init()
    device_count = pygame.midi.get_count()
    if device_count == 0:
        print("No MIDI devices found.")
    else:
        print(f"{device_count} MIDI devices found.")
        for i in range(device_count):
            info = pygame.midi.get_device_info(i)
            if info[2] == 1:  # 出力デバイスの場合
                print(f"Device {i}: {info}")

    # 適切なデバイス ID を設定
    output_device_id = 2  # MIDI 出力デバイス ID を指定
    num_primes = 50        # 再生する素数の個数
    duration = 180         # 再生時間（秒）

    primes = generate_primes(num_primes)
    play_prime_midi(primes, output_device_id, duration)



