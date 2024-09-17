import java.util.Scanner;

public class ReverseArrayPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        int N = scanner.nextInt();

        // Create an array to hold the integers
        int[] A = new int[N];

        // Read the integers into the array
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // Print the elements of A in reverse order
        for (int i = N - 1; i >= 0; i--) {
            System.out.print(A[i] + " ");
        }

        // Print a new line at the end
        System.out.println();
    }
}

