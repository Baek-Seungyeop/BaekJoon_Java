import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_1546 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int max = 0;
        int[] score = new int[n];

        for(int i = 0; i < n; i++) {
            score[i] = Integer.parseInt(st.nextToken());

            if(score[i] > max)
                max = score[i];
        }

        double sum = 0;

        for(int i = 0; i < n; i++) {
            sum += (double)score[i] / (double)max * 100;
        }

        sum /= n;

        System.out.println(sum);
    }
}
