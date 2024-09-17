import java.util.Scanner;

public class MazeSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int W = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        
        char[][] maze = new char[H][W];
        scanner.nextLine(); // Consume the newline character
        for (int i = 0; i < H; i++) {
            String row = scanner.nextLine();
            maze[i] = row.toCharArray();
        }
        
        char square = maze[r - 1][c - 1];
        
        if (square == '#') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

