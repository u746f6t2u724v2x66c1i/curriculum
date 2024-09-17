import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for (int n = 1; n <= 10; n++) {
            System.out.println(N + " x " + n + " = " + N * n);
        }

        bufferedReader.close();
    }
}
