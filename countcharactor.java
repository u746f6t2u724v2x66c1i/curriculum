import java.util.Scanner;

public class countcharactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int[] count = new int[10];

        for (int i = 0; i < num.length(); i++) {
            char currentChar = num.charAt(i);
            if (Character.isDigit(currentChar)) {
                int digit = Character.getNumericValue(currentChar);
                count[digit]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(count[i] + " ");
        }
        System.out.print("\n");
    }
}

