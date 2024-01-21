import java.util.Scanner;

public class InsertionSort {
    static void insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();

        System.out.print("Original array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        insertionSort(arr);

        System.out.print("\nSorted array: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        System.out.println();  // Output a new line
    }
}

