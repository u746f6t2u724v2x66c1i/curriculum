import java.util.Scanner;

public class NumberFormatter01 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        // Format the number with commas
        String formattedNumber = formatNumber(number);

        // Display the formatted number
        System.out.println("Formatted number: " + formattedNumber);

        // Close the Scanner
        scanner.close();
    }

    // Method to format a number with commas every three digits
    private static String formatNumber(long number) {
        // Convert the number to a string
        String numberStr = Long.toString(number);

        // Initialize a StringBuilder to build the formatted number
        StringBuilder formattedNumber = new StringBuilder();

        // Iterate over the characters in reverse order
        for (int i = numberStr.length() - 1, count = 0; i >= 0; i--, count++) {
            // Add a comma every three digits
            if (count > 0 && count % 3 == 0) {
                formattedNumber.insert(0, ',');
            }
            formattedNumber.insert(0, numberStr.charAt(i));
        }

        return formattedNumber.toString();
    }
}

