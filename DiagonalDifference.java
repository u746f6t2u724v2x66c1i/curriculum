import java.util.Scanner;

public class DiagonalDifference {

    public static int diagonalDifference(int[][] arr) {
        int n = arr.length;
        int sum1 = 0; // sum of the main diagonal
        int sum2 = 0; // sum of the secondary diagonal
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        return Math.abs(sum1 - sum2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int diagonalDifference = diagonalDifference(arr);
        System.out.println(diagonalDifference);
    }
}
