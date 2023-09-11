num = input()
count = [0] * 10

for char in num:
    if char.isdigit():
        digit = int(char)
        count[digit] += 1

print(*count)

