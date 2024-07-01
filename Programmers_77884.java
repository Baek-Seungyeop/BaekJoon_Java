public class Programmers_77884 {

    static int[] num = new int[1001];

    public static void init() {
        num[1] = -1;
        for (int i = 2; i <= 1000; i++) {
            int cnt = getMeasureCnt(i);
            if (cnt % 2 == 0) {
                num[i] = i;
            } else {
                num[i] = -i;
            }
        }
    }

    private static int getMeasureCnt(int num) {
        int cnt = 1;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) cnt++;
        }
        return cnt;
    }

    public static int solution(int left, int right) {
        init();
        int answer = 0;
        for (int i = left; i <= right; i++) {
            answer += num[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(1, 2));
        System.out.println(solution(24, 27));
    }
}
