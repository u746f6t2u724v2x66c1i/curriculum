import java.util.*;

public class Max_min {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        Collections.sort(a);

        System.out.println(a.get(2) - a.get(0));
    }
}
