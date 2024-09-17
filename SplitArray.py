n, m = map(int, input().split())
a = list(map(int, input().split()))
b = list(map(int, input().split()))

nextIndex = 0
for x in b:
    for i in range(x):
        print(a[nextIndex], end="")
        if i < x - 1:
            print(" ", end="")
        else:
            print()
        nextIndex += 1

