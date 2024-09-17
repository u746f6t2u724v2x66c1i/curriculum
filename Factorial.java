import java.util.Scanner; // Import the Scanner class

public class Factorial {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // You can change this value to any integer within the constraints (2 <= n <= 12)
        int result = factorial(n);
        System.out.println(result);
    }
}
