import java.util.*;

public class SequenceOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        for (int i = 0; i < q; i++) {
            int query = sc.nextInt();
            if (query == 0) {
                int x = sc.nextInt();
                a.add(x);
            } else if (query == 1) {
                a.remove(a.size() - 1);
            } else {
                for (int j = 0; j < a.size(); j++) {
                    System.out.print(a.get(j));
                    if (j < a.size() - 1) {
                        System.out.print(" ");
                    } else {
                        System.out.println();
                    }
                }
            }
        }
    }
}

