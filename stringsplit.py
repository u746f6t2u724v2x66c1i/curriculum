def main():
    input_string = input("Enter the ten strings separated by spaces: ")
    strings = input_string.split(' ')
    
    for string in strings:
        print(string)

if __name__ == "__main__":
    main()

