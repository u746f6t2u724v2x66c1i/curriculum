import java.util.*;
public class stringresult {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
        Scanner sc = new Scanner(System.in);
        
        String[] strings = new String[10];

        for (int i = 0; i < 10; i++) {
            strings[i] = sc.next();
        }

        String result = "";
        for (int i = 0; i < 10; i++) {
            result += strings[i];
            if (i < 9) {
                result += " ";
            }
        }

        System.out.println(result);
    }
}
