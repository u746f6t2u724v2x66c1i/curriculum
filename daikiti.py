import random

# Generate a random number between 1 and 9
extracted_number = random.randint(1, 9)

# Check if the extracted number is 7 (considered good luck)
is_daikichi = extracted_number == 7

# Output the result
print(f"The extracted number is: {extracted_number}")
print(f"Is it Daikichi? {'Yes' if is_daikichi else 'No'}")
