def read_strings():
    strings = []
    print("Enter 10 strings:")
    for i in range(10):
        strings.append(input())
    return strings

def concatenate_strings(strings):
    return " ".join(strings)

def main():
    strings = read_strings()
    result = concatenate_strings(strings)
    print("Concatenated string:", result)

if __name__ == "__main__":
    main()

