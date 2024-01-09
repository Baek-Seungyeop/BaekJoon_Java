import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Problem_15829 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long r = 1, M = 1234567891;
        long sum = 0;

        for (int i = 0; i < L; i++) {
            int n = str.charAt(i) - 'a' + 1;
            sum += (n * r);

            r = (r * 31) % M;
        }
        System.out.println(sum % M);
    }
}
