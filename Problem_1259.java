import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Problem_1259 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        while(true) {
            String str = br.readLine();

            if(str.equals("0")) {
                break;
            }

            int len = str.length();
            boolean isPalindrome = true;

            for(int i = 0; i < len / 2; i++) {
                if(str.charAt(i) != str.charAt(len - i - 1)) {
                    isPalindrome = false;
                    break;
                }
            }

            if(isPalindrome) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
