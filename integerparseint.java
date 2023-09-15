import java.util.*;
public class integerparseint {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        String tokenA = sc.next();
        String tokenB = sc.next();
        
        int A = Integer.parseInt(tokenA);
        int B = Integer.parseInt(tokenB);        
        
        int C = A - B;
        int D = A * B;
        System.out.println(C + " " + D);
    }
}
