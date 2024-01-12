import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Problem_2751 {
    public static void main(String[] args) throws Exception {
//        InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//
//        int N = Integer.parseInt(br.readLine());
//        int[] num = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            num[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.parallelSort(num);
//
//        StringBuilder sb = new StringBuilder();
//        for (int i : num) {
//            sb.append(i).append('\n');
//        }
//
//        System.out.print(sb.toString());


        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        StringBuilder sb = new StringBuilder();

        ArrayList<Integer> list = new ArrayList<>();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int i : list) {
            sb.append(i).append("\n");
        }
        System.out.println(sb);
    }
}
