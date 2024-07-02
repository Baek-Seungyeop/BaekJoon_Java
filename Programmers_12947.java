public class Programmers_12947 {

    public static boolean solution(int x) {
        int harshad = getHarshad(x);
        return x % harshad == 0;
    }

    public static int getHarshad(int x) {
        int harshad = 0;
        String num = Integer.toString(x);
        for (int i = 0; i < num.length(); i++) {
            harshad += num.charAt(i) - '0';
        }
        return  harshad;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
        System.out.println(solution(12));
        System.out.println(solution(11));
        System.out.println(solution(13));
        System.out.println(solution(2));
    }
}