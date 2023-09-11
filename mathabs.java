import java.util.Scanner;

public class mathabs {

    static void update(int a, int b) {
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        System.out.print("Enter two integers: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        update(a, b);

        System.out.println(a + b);
        System.out.println(Math.abs(a - b)); // Use Math.abs(a - b) to calculate the absolute difference

        scanner.close();
    }
}

