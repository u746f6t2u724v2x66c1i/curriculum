import java.util.ArrayList;
import java.util.Scanner;

public class SequenceOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // Number of elements in A
        int Q = scanner.nextInt(); // Number of operations

        ArrayList<Integer> sequence = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            int element = scanner.nextInt();
            sequence.add(element);
        }

        for (int i = 0; i < Q; i++) {
            int operation = scanner.nextInt();
            if (operation == 0) {
                int x = scanner.nextInt();
                sequence.add(x); // push_back x
            } else if (operation == 1) {
                if (!sequence.isEmpty()) {
                    sequence.remove(sequence.size() - 1); // pop_back
                }
            } else if (operation == 2) {
                for (int j = 0; j < sequence.size(); j++) {
                    System.out.print(sequence.get(j));
                    if (j < sequence.size() - 1) {
                        System.out.print(" ");
                    }
                }
                System.out.println(); // print
            }
        }
    }
}

