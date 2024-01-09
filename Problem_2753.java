import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Problem_2753 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int year = Integer.parseInt(br.readLine());

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
