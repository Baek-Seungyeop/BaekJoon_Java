import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Problem_2609 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int gcd = getGCD(a, b);
        int lcm = getLCM(a, b, gcd);

        System.out.println(gcd);
        System.out.println(lcm);
    }

    // 유클리드 호제법을 사용한 GCD 계산
    private static int getGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // LCM 계산
    private static int getLCM(int a, int b, int gcd) {
        return a * b / gcd;
    }
}