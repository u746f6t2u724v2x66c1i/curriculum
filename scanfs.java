import java.util.Scanner;

public class scanfs {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Read a full line of input from the user and store it in a variable
        String inputString = scanner.nextLine();

        // Print a string literal saying "Hello, World." to the console
        System.out.println("Hello, World.");

        // Print the contents of inputString to the console
        System.out.println(inputString);

        // Close the scanner
        scanner.close();
    }
}

