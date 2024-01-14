import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_10816 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int M = Integer.parseInt(st.nextToken());
        int[] givenCard = new int[20000001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken()) + 10000000;
            givenCard[num]++;
        }

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int[] myCard = new int[20000001];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken()) + 10000000;
            sb.append(givenCard[num]).append(" ");
        }

        System.out.println(sb);
    }
}
