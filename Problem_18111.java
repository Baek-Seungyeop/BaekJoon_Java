import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_18111 {
    public static int getTime(int[][] map, int B, int target) {
        int time = 0;

        for (int[] ints : map) {
            for (int anInt : ints) {
                int n = anInt - target;
                if (anInt > target) {
                    time += n * 2;  B += n;
                }
            }
        }

        for (int[] ints : map) {
            for (int anInt : ints) {
                int n = target - anInt;
                if (anInt < target) {
                    time += n;  B -= n;
                    if (B < 0) return -1;
                }
            }
        }
        return time;
    }


    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] map = new int[N][M];
        int min = 300, max = -1;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (min > map[i][j]) {
                    min = map[i][j];
                }
                if (max < map[i][j]) {
                    max = map[i][j];
                }
            }
        }

        int min_time = Integer.MAX_VALUE, height = 0;

        for (int i = min; i <= max; i++) {
            int time = getTime(map, B, i);

            if (time != -1 && min_time >= time) {
                min_time = time;
                height = i;
            }
        }
        System.out.println(min_time + " " + height);
    }
}