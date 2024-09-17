import java.util.Scanner;

public class NumberSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter n numbers separated by half-width spaces: ");
        String input = scanner.nextLine();
        
        // Split the input string by half-width spaces
        String[] numbersArray = input.split(" ");
        
        // Output the numbers separated by commas
        System.out.print("Output: ");
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i]);
            if (i < numbersArray.length - 1) {
                System.out.print(",");
            }
        }       
        scanner.close();
        System.out.print("\n");
    }
}
