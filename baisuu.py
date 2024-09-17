N = int(input("Enter a number: "))

for i in range(1, N+1):
    for j in range(1, N+1):
        if j % N != 0:
            print(i * j, end=" ")
        else:
            print(i * j)

