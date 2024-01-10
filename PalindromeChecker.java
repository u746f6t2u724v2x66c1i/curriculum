import java.util.Scanner;

public class PalindromeChecker {
    private String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean isPalindrome() {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        PalindromeChecker palindromeChecker = new PalindromeChecker(input);

        if (palindromeChecker.isPalindrome()) {
            System.out.println("The word, " + input + ", is a palindrome.");
        } else {
            System.out.println("The word, " + input + ", is not a palindrome.");
        }
    }
}


