def main():
    # Input n and m
    n, m = map(int, input("Enter n and m separated by a space: ").split())

    # Input n numbers
    numbers = list(map(int, input("Enter n numbers separated by spaces: ").split()))

    # Output the mth numerical value
    if 1 <= m <= n:
        print(f"The {m}th numerical value is: {numbers[m - 1]}")
    else:
        print("Invalid input for m.")


if __name__ == "__main__":
    main()

