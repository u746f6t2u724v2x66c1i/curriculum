import java.util.Scanner;

public class StringConcatenator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strings = new String[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = sc.next();
        }

        java.lang.StringBuilder result = new java.lang.StringBuilder();  // Use the fully qualified name
        for (int i = 0; i < 10; i++) {
            result.append(strings[i]);
            if (i < 9) {
                result.append(" ");
            }
        }

        System.out.println(result.toString());
    }
}
