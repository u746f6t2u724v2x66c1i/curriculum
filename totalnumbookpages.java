import java.util.Scanner;

public class totalnumbookpages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int totalShelves = scanner.nextInt();
        int totalQueries = scanner.nextInt();
        
        int[] totalNumBooks = new int[totalShelves];
        int[][] totalNumPages = new int[totalShelves][1100];
        
        for (int i = 0; i < totalShelves; i++) {
            for (int j = 0; j < 1100; j++) {
                totalNumPages[i][j] = 0;
            }
        }
        
        for (int q = 0; q < totalQueries; q++) {
            int queryType = scanner.nextInt();
            
            if (queryType == 1) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                totalNumPages[x][totalNumBooks[x]] = y;
                totalNumBooks[x]++;
            } else if (queryType == 2) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                
                System.out.println(totalNumPages[x][y]);
            } else if (queryType == 3) {
                int x = scanner.nextInt();
                
                System.out.println(totalNumBooks[x]);
            }
        }
        
        scanner.close();
    }
}
