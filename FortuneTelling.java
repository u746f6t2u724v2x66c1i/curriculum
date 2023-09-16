import java.util.Random;

public class FortuneTelling {
    public static void main(String[] args) {
        // Generate a random number between 1 and 9
        Random random = new Random();
        int extractedNumber = random.nextInt(9) + 1;

        // Check if the extracted number is 7 (considered good luck)
        boolean isDaikichi = extractedNumber == 7;

        // Output the result
        System.out.println("The extracted number is: " + extractedNumber);
        System.out.println("Is it Daikichi? " + isDaikichi);
    }
}
