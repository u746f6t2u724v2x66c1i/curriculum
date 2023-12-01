import java.util.*;

public class Mainlength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        for (int i = 0; i < n.length(); i++) {
            if (i != 0 && i % 3 == 0) {
                System.out.print(",");
            }
            System.out.print(n.charAt(i));
        }
        System.out.println();

        sc.close();
    }
}
