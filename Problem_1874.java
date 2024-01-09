import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class Problem_1874 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<Integer>();

        int last_value = 0;

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(br.readLine());

            if (value > last_value) {
                for (int j = last_value + 1; j <= value; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                last_value = value;
            } else {
                if (stack.peek() != value) {
                    System.out.println("NO");
                    return;
                }
            }
            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb.toString());
    }
}