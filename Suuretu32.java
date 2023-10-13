import java.util.*;

public class Suuretu32 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int q = sc.nextInt();

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            b.add(sc.nextInt());
        }

        for (int x : b) {
            System.out.println(a.get(x - 1));
        }
    }
}
