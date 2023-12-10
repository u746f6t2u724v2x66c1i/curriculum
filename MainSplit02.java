import java.util.*;

public class MainSplit02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        int nextIndex = 0;
        for (int x : b) {
            for (int i = 0; i < x; i++) {
                System.out.print(a[nextIndex]);
                if (i < x - 1) {
                    System.out.print(" ");
                } else {
                    System.out.println();
                }

                nextIndex += 1;
            }
        }

        sc.close();
    }
}
