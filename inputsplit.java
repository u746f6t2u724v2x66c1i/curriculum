import java.util.Scanner;

public class inputsplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the ten strings separated by spaces
        System.out.println("Enter the ten strings separated by half-width spaces:");
        String input = sc.nextLine();

        // Split the input string into an array of strings
        String[] strings = input.split(" ");

        // Output each string separated by a line break
        for (String str : strings) {
            System.out.println(str);
        }
    }
}


