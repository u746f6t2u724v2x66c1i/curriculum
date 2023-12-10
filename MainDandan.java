import java.util.*;
public class MainDandan {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numuber: ");
        int N = sc.nextInt();
        for(int i = 1; i <= N; i++) {
            for(int j = 1; j <= i; j++) {
                if(j != i) {
                    System.out.print(j + " ");
                } else if(j == i) {
                    System.out.println(j);
                }
            }
        }
    }
}
