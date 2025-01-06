import pygame.midi
import time

def fib2(n, a=1, b=0): 
    if n == 0: 
        return 0 
    elif n == 1: 
        return a 
    else: 
        return fib2(n - 1, a + b, a)

# MIDIノート番号を使って音を再生
def play_fibonacci_music(n_terms):
    pygame.midi.init()
    player = pygame.midi.Output(0)  # デフォルトのMIDIデバイスを選択
    instrument = 0  # ピアノ音
    player.set_instrument(instrument)
    
    for i in range(n_terms):
        note = fib2(i) % 88 + 21  # MIDIノート範囲にフィット（21〜108: ピアノ範囲）
        print(f"Playing note: {note} (Fibonacci term: {fib2(i)})")
        player.note_on(note, 127)  # 音を鳴らす
        time.sleep(0.5)  # 0.5秒間再生
        player.note_off(note, 127)  # 音を止める
    
    player.close()
    pygame.midi.quit()

# フィボナッチ数列の最初の10個の音を再生
play_fibonacci_music(10)

