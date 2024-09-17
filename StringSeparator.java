import java.util.Scanner;

public class StringSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        // Read 10 strings from the user
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Concatenate the strings with " | " separator
        String result = String.join(" | ", strings);

        // Print the result
        System.out.println(result);
    }
}



