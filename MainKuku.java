import java.util.*;
public class MainKuku {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                if(j % 9 != 0) {    
                    System.out.print(i * j + " ");
                } else if(j % 9 == 0) {
                System.out.println(i * j);
                }
            }
        }
    }
}
