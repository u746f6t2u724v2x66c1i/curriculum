import java.util.Scanner;

public class Suuretu03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input n
        int n = scanner.nextInt();

        // Input n numbers01
        int[] numbers01 = new int[n];
        for (int i = 0; i < n; i++) {
            numbers01[i] = scanner.nextInt();
        }

        // Input m
        int m = scanner.nextInt();

        // Input n numbers02
        int[] numbers02 = new int[m];
        for (int i = 0; i < m; i++) {
            numbers02[i] = scanner.nextInt();
        }

        for (int i = 0; i < m; i++) {
            int index = numbers02[i] - 1;
            if (index < numbers01.length) {
                System.out.println(numbers01[index]);
            } else {
                System.out.println("Ten");
            }
        }
    }
}

