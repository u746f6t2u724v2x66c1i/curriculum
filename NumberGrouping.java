import java.util.Scanner;

public class NumberGrouping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] numbers = input.split(" ");

        // Validate and process the input
        if (isValidInput(numbers)) {
            organizeAndPrintGroups(numbers);
        }

        scanner.close();
    }

    private static boolean isValidInput(String[] numbers) {
        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                if (num < 0 || num > 1000) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false; // Not a valid integer
            }
        }
        return true;
    }

    private static void organizeAndPrintGroups(String[] numbers) {
        for (int i = 0; i < numbers.length; i += 3) {
            for (int j = i; j < i + 3 && j < numbers.length; j++) {
                if(j % 3 == 1) {
                    System.out.print(numbers[j] + " ");
                } else if(j % 3 == 2) {
                    System.out.print(numbers[j]);
                } else if(j % 3 == 0) {
                    System.out.print(numbers[j] + " ");
                }
            }
            System.out.println();
        }
    }
}
