import java.util.*;

public class Numubergrupe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] n = new int[9];
        for (int i = 0; i < 9; i++) {
            n[i] = sc.nextInt();
        }

        for (int i = 0; i < 9; i++) {
            System.out.print(n[i]);
            if (i % 3 == 2) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

        sc.close();
    }
}
