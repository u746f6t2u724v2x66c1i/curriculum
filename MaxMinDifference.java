import java.util.Scanner;

public class MaxMinDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three natural numbers (A B C): ");
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int max = Math.max(Math.max(A, B), C);
        int min = Math.min(Math.min(A, B), C);

        int difference = max - min;

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
        System.out.println("Difference: " + difference);
    }
}


