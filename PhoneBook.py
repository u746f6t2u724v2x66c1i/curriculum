def main():
    n = int(input())

    # Create a phone book as a dictionary to store the entries
    phone_book = {}

    # Populate the phone book
    for _ in range(n):
        name, phone_number = input().split()
        phone_book[name] = phone_number

    # Process queries and print the results
    while True:
        try:
            query = input()
            if query in phone_book:
                print(f"{query}={phone_book[query]}")
            else:
                print("not found")
        except EOFError:
            break

if __name__ == "__main__":
    main()

