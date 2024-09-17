import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution123 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();

        try {
            int parsedInt = Integer.parseInt(S);
            System.out.println(parsedInt);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

        bufferedReader.close();
    }
}

