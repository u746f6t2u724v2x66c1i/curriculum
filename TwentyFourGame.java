import java.util.Random;
import java.util.Scanner;

public class TwentyFourGame {
    public static void main(String[] args) {
        Random random = new Random();
        int[] digits = new int[4];

        // Generate four random digits from 1 to 9 (inclusive)
        for (int i = 0; i < 4; i++) {
            digits[i] = random.nextInt(9) + 1;
        }

        System.out.print("Random digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter an arithmetic expression using these digits: ");
            String userExpression = scanner.nextLine();

            if (validateExpression(userExpression, digits)) {
                double result = evaluateExpression(userExpression);
                if (Math.abs(result - 24) < 0.0001) {
                    System.out.println("Congratulations! The expression evaluates to 24.");
                    break;
                } else {
                    System.out.println("The expression does not evaluate to 24. Try again.");
                }
            } else {
                System.out.println("Invalid characters in the expression. Try again.");
            }
        }
    }

    private static double evaluateExpression(String expression) {
        try {
            return Double.parseDouble(expression);
        } catch (NumberFormatException e) {
            System.out.println("Invalid expression format.");
            return Double.NaN;
        }
    }

    private static boolean validateExpression(String expression, int[] digits) {
        // Check if the expression is valid using only the given digits
        for (int digit : digits) {
            if (expression.contains(String.valueOf(digit))) {
                expression = expression.replaceFirst(String.valueOf(digit), "");
            } else {
                return false;
            }
        }

        // Check if the expression is empty after replacing all digits
        return expression.trim().isEmpty();
    }
}

