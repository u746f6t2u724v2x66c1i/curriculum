strings = []

print("Enter 10 strings:")

# Read 10 input strings
for i in range(10):
    strings.append(input())

# Concatenate the strings with spaces
result = " ".join(strings)

# Print the concatenated string
print("Concatenated string:", result)

