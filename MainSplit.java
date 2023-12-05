import java.util.*;
public class MainSplit {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numuber: ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            if(i <= N && i != N / 2 && i != N) {    
                System.out.print(i + " ");
            } else if(i == N /2) {
                System.out.println(i);
            } else if(i == N) {
                System.out.println(i);
            }
        }
    }
}
