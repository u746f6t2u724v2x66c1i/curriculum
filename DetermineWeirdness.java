import java.util.Scanner;

public class DetermineWeirdness {
    public static String ltrim(String str) {
        return str.replaceAll("^\\s+", "");
    }

    public static String rtrim(String str) {
        return str.replaceAll("\\s+$", "");
    }

    public static String determineWeirdness(int N) {
        if (N % 2 != 0)
            return "Weird";
        else {
            if (N >= 2 && N <= 5)
                return "Not Weird";
            else if (N >= 6 && N <= 20)
                return "Weird";
            else
                return "Not Weird";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String N_temp = scanner.nextLine();
        int N = Integer.parseInt(rtrim(ltrim(N_temp)));

        System.out.println(determineWeirdness(N));
    }
}

