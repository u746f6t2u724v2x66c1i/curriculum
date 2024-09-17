import java.util.Scanner;

public class NumbersSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 20 numbers separated by half-width spaces: ");
        String input = scanner.nextLine();

        // Split the input by half-width spaces and store in an array
        String[] numbersArray = input.split(" ");

        // Create a StringBuilder to store the output
        java.lang.StringBuilder output = new java.lang.StringBuilder();

        // Append the numbers separated by commas
        for (int i = 0; i < numbersArray.length; i++) {
            output.append(numbersArray[i]);
            if (i < numbersArray.length - 1) {
                output.append(",");
            }
        }

        // Print the output
        System.out.println("Output: " + output.toString());
    }
}

