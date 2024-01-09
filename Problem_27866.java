import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Problem_27866 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String str = br.readLine();

        int n = Integer.parseInt(br.readLine());

        char c = str.charAt(n - 1);
        System.out.println(c);
    }
}