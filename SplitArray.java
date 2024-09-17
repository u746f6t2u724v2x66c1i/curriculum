import java.util.Scanner;
import java.util.ArrayList;

public class SplitArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Reading array elements
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Reading split indices
        int[] indices = new int[k];
        for (int i = 0; i < k; i++) {
            indices[i] = scanner.nextInt();
        }

        // Processing and printing output
        splitArray(array, indices);
    }

    private static void splitArray(int[] array, int[] indices) {
        int currentIndex = 0;

        for (int index : indices) {
            boolean isFirst = true;

            // Adding elements to subArray
            for (int i = currentIndex; i < currentIndex + index; i++) {
                if (!isFirst) {
                    System.out.print(" ");
                }
                System.out.print(array[i]);
                isFirst = false;
            }

            // Printing a new line for each subArray
            System.out.println();

            // Updating currentIndex for the next subArray
            currentIndex += index;
        }

        // Printing remaining elements (if any)
        while (currentIndex < array.length) {
            System.out.print(array[currentIndex] + " ");
            currentIndex++;
        }
    }
}

