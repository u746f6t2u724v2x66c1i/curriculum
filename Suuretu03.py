def main():
    # Input n
    n = int(input())

    # Input n numbers01
    numbers01 = list(map(int, input().split()))

    # Input m
    m = int(input())

    # Input n numbers02
    numbers02 = list(map(int, input().split()))

    for i in range(m):
        index = numbers02[i] - 1
        if index < len(numbers01):
            print(numbers01[index])
        else:
            print("Ten")

if __name__ == "__main__":
    main()

