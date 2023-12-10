import java.util.*;
public class MainNtoM {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int N = sc.nextInt();
        int M = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            if(i != N) {
                System.out.print(i + " ");
            } else if(i == N) {
                System.out.println(i);
            }
        }
        for(int j = 1; j <= M; j++) {
            if(j != M) {
                System.out.print(j +" ");
            } else if(j == M) {
                System.out.println(j);
            }
        }
    }
}
