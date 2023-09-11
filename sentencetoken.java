import java.util.Scanner;

public class sentencetoken{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();  // 入力文を読み込みます

        String[] words = sentence.split(" ");  // スペースを区切り文字として、文を単語に分割します

        for (String word : words) {
            System.out.println(word);  // 各単語を新しい行に出力します
        }
    }
}

