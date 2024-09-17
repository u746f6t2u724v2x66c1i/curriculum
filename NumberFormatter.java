import java.text.DecimalFormat;
import java.util.Scanner;

public class NumberFormatter {
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

    // Method to format a number with commas
    private static String formatNumber(long number) {
        // Use DecimalFormat to add commas to the number
        DecimalFormat formatter = new DecimalFormat("#,###");
        return formatter.format(number);
    }
}

