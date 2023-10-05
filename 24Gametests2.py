import itertools

def generate_digits():
    """Generate four random digits from 1 to 9 (inclusive)."""
    return [str(random.randint(1, 9)) for _ in range(4)]

def evaluate_expression(expression):
    """Evaluate the arithmetic expression."""
    try:
        return eval(expression)
    except ZeroDivisionError:
        return None

def validate_expression(expression, digits):
    """Check if the expression is valid using only the given digits."""
    valid_chars = set(''.join(digits + ['+', '-', '*', '/']))
    input_chars = set(expression.replace(' ', ''))
    return input_chars.issubset(valid_chars)

def main():
    digits = generate_digits()
    print("Random digits:", ' '.join(digits))
    
    while True:
        user_expression = input("Enter an arithmetic expression using these digits: ")
        
        if validate_expression(user_expression, digits):
            result = evaluate_expression(user_expression)
            if result == 24:
                print("Congratulations! The expression evaluates to 24.")
                break
            else:
                print("The expression does not evaluate to 24. Try again.")
        else:
            print("Invalid characters in the expression. Try again.")

if __name__ == "__main__":
    import random
    main()

