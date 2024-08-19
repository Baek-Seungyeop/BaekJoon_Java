import java.util.Stack;

public class Programmers_12909 {

    static boolean solution(String s) {
        int len = s.length();
        if (s.charAt(0) == ')') return false;
        if (s.charAt(len-1) == '(') return false;
        if (len % 2 == 1) return false;

        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '(') {
                cnt++;
                stack.add(c);
            } else if (c == ')') {
                cnt--;
                if (cnt < 0) return false;
                stack.pop();
            }
        }

        return cnt == 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("()()"));
        System.out.println(solution("(())()"));
        System.out.println(solution(")()("));
        System.out.println(solution("(()("));
        System.out.println(solution("())((()))(()"));
    }
}
