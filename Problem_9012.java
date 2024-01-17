import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_9012 {
    public static boolean isVPS(String str) {
        int len = str.length();
        int cnt = 0;

        if (len % 2 == 1) {
            return false;
        } else if (str.charAt(0) == ')' || str.charAt(len - 1) == '(') {
            return false;
        } else {
            Stack<Character> s = new Stack<Character>();

            for(int j = 0; j < len; j++) {
                s.push(str.charAt(j));
            }

            while(!s.empty()) {
                if(s.peek() == ')')
                    cnt++;
                else
                    cnt--;

                s.pop();

                if(cnt < 0)
                    return false;
            }
        }

        return cnt == 0;
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i++) {
            String str = br.readLine();

            if(isVPS(str))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
