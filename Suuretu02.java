import java.util.Scanner;

public class Suuretu02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n and m
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input n numbers
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Output the mth numerical value
        if (m > 0 && m <= n) {
            System.out.println("The " + m + "th numerical value is: " + numbers[m - 1]);
        } else {
            System.out.println("Invalid input for m.");
        }
    }
}

