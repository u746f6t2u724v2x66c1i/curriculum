a = [int(x) for x in input("Enter three natural numbers (A B C D E F): ").split()]

# Find the maximum and minimum
max_value = max(a)
min_value = min(a)

# Calculate and print the difference
print("Maximum value:", max_value)
print("Minimum value:", min_value)
print("Difference:", max_value - min_value)

