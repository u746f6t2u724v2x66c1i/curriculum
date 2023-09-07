import java.util.Scanner;

public class arraySplitting {
    // Function to find the maximum number of splits
    static int maxSplits(int[] arr, int start, int end) {
        if (start == end) {
            return 0;
        }

        int totalSum = 0;
        for (int i = start; i < end; i++) {
            totalSum += arr[i];
        }

        int leftSum = 0;
        int maxScore = 0;

        for (int i = start; i < end - 1; i++) {
            leftSum += arr[i];
            totalSum -= arr[i];

            if (leftSum == totalSum) {
                int leftResult = maxSplits(arr, start, i + 1);
                int rightResult = maxSplits(arr, i + 1, end);
                maxScore = 1 + Math.max(leftResult, rightResult);
                break;
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        while (t-- > 0) {
            int n = scanner.nextInt(); // Size of the array
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int result = maxSplits(arr, 0, n);
            System.out.println(result);
        }
    }
}
