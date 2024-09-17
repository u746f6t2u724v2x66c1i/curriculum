import java.util.*;
public class Mainhairetu {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N and enter N numbers: ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            int M = sc.nextInt();
            for(int j = 1; j <= M; j++) {
                if(j != M) {
                    System.out.print(j + " ");
                } else if(j == M) {
                    System.out.println(j);
                }
            }
        }
        sc.close();        
    }
}
