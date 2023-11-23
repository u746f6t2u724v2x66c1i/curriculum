import java.util.Scanner;
import java.util.Arrays;

class Difference {
    private int[] elements;
    public int maximumDifference;

    // Constructor to initialize the elements array
    public Difference(int[] elements) {
        this.elements = elements;
    }

    // Method to compute the maximum absolute difference
    public void computeDifference() {
        // Sort the array to get the minimum and maximum values
        Arrays.sort(elements);

        // Calculate the absolute difference between the first and last elements
        maximumDifference = Math.abs(elements[0] - elements[elements.length - 1]);
    }
}

public class Solution01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int n = scanner.nextInt();

        // Read the array elements
        int[] elements = new int[n];
        for (int i = 0; i < n; i++) {
            elements[i] = scanner.nextInt();
        }

        // Close the scanner
        scanner.close();

        // Create an instance of the Difference class with the given input
        Difference difference = new Difference(elements);

        // Compute the maximum absolute difference
        difference.computeDifference();

        // Access the maximumDifference variable and print the result
        System.out.println(difference.maximumDifference);
    }
}

