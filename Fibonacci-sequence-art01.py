import matplotlib.pyplot as plt
import numpy as np

def fib2(n, a=1, b=0): 
    if n == 0: 
        return 0 
    elif n == 1: 
        return a 
    else: 
        return fib2(n - 1, a + b, a)

def draw_fibonacci_spiral(n_terms):
    angles = []  # スパイラルの角度
    radii = []   # スパイラルの半径（フィボナッチ数列）
    
    for i in range(n_terms):
        radii.append(fib2(i))
        angles.append(i * np.pi / 2)  # 90度ずつ回転

    # スパイラルを描画
    theta = np.array(angles)
    r = np.array(radii)
    x = r * np.cos(theta)
    y = r * np.sin(theta)
    
    plt.figure(figsize=(6, 6))
    plt.plot(x, y, marker="o", linestyle="-", color="blue")
    plt.title("Fibonacci Spiral")
    plt.axis("equal")  # 軸を等しくして正円に
    plt.show()

# フィボナッチ数列でスパイラルを描画
draw_fibonacci_spiral(15)

