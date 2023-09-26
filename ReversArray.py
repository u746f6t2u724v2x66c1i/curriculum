def main():
    N = int(input())
    A = list(map(int, input().split()))

    for i in range(N - 1, -1, -1):
        print(A[i], end=" ")

    print()

if __name__ == "__main__":
    main()

