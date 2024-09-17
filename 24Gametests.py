import random

def generate_four_digits():
  """Generates four random digits between 1 and 9 (inclusive) with repetitions allowed."""
  digits = []
  for i in range(4):
    digit = random.randint(1, 9)
    digits.append(digit)
  return digits

def evaluate_expression(expression, digits):
  """Evaluates an arithmetic expression using the given digits.

  Args:
    expression: A string representing the arithmetic expression.
    digits: A list of four digits.

  Returns:
    The result of evaluating the expression, as a floating-point number.
  """

  # Create a dictionary to map the digits to their values.
  digit_map = {}
  for i in range(4):
    digit_map[str(digits[i])] = digits[i]

  # Evaluate the expression using the digit map.
  result = eval(expression, digit_map)

  return result

def main():
  """The main function."""

  # Generate four random digits.
  digits = generate_four_digits()

  # Display the digits to the player.
  print("The four digits are:", digits)

  # Prompt the player for an arithmetic expression.
  expression = input("Enter an arithmetic expression using all four digits, exactly once each, to evaluate to 24: ")

  # Evaluate the expression.
  result = evaluate_expression(expression, digits)

  # Check if the expression evaluates to 24.
  if result == 24:
    print("Correct! The expression evaluates to 24.")
  else:
    print("Incorrect. The expression evaluates to", result)

if __name__ == "__main__":
  main()

