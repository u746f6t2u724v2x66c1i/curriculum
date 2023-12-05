import java.util.*;
public class Mainbaisuu {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i = 1; i <= N; i++) {
            for(int j =1; j <= N; j++) {
                if(j % N != 0) {
                    System.out.print(i * j + " ");
                } else if(j % N == 0) {
                    System.out.println(i * j);
                }
            }
        }
    }
}
