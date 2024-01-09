import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Problem_10845 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        StringTokenizer st = new StringTokenizer(br.readLine());

        Queue<Integer> queue = new LinkedList<>();

        int lastNum = -1;
        int N = Integer.parseInt(st.nextToken());
        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            if ("push".equals(command)) {
                int num = Integer.parseInt(st.nextToken());

                lastNum = num;
                queue.add(num);
            } else if ("size".equals(command)) {
                System.out.println(queue.size());
            } else if ("empty".equals(command)) {
                if (queue.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            } else {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                } else {
                    if ("pop".equals(command)) {
                        System.out.println(queue.poll());
                    } else if ("front".equals(command)) {
                        System.out.println(queue.peek());
                    } else if ("back".equals(command)) {
                        System.out.println(lastNum);
                    }
                }
            }
        }
    }
}
