import java.util.Scanner;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        String binaryRepresentation = Integer.toBinaryString(n);
        int maxConsecutiveOnes = findMaxConsecutiveOnes(binaryRepresentation);
        System.out.println(maxConsecutiveOnes);
    }

    public static int findMaxConsecutiveOnes(String binary) {
        int maxCount = 0;
        int currentCount = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                currentCount++;
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}

