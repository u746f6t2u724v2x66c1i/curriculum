import java.util.*;

public class StringBuilderExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[3];

        for (int i = 0; i < 3; i++) {
            strings[i] = sc.next();
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < 3; i++) {
            result.append(strings[i]);
            if (i < 9) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}


