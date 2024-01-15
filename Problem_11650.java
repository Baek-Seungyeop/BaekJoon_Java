import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Problem_11650 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        ArrayList<Point> list = new ArrayList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            list.add(new Point(x, y));
        }

        list.sort((o1, o2) -> {
            if(o1.x > o2.x) {
                return 1;
            } else if(o1.x < o2.x) {
                return -1;
            } else {
                if(o1.y > o2.y) {
                    return 1;
                } else if(o1.y < o2.y) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for(Point point : list) {
            sb.append(point.x).append(" ").append(point.y).append("\n");
        }

        System.out.println(sb);
    }
}
