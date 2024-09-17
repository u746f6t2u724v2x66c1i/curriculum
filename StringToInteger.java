import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        scanner.close();

        String result = parseAndPrintInteger(s);
        System.out.println(result);
    }

    private static String parseAndPrintInteger(String s) {
        try {
            int parsedInt = Integer.parseInt(s);
            return Integer.toString(parsedInt);
        } catch (NumberFormatException e) {
            return "Bad String";
        }
    }
}

