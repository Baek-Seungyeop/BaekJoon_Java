import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Problem_10866 {
    static Deque<Integer> deque = new ArrayDeque<>();

    public static void push_front(int value) {
        deque.addFirst(value);
    }
    public static void push_back(int value) {
        deque.addLast(value);
    }
    public static void pop_front() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.removeFirst());
        }
    }
    public static void pop_back() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.removeLast());
        }
    }
    public static void size() {
        System.out.println(deque.size());
    }
    public static void empty() {
        if (deque.isEmpty()) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    public static void front() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.peekFirst());
        }
    }
    public static void back() {
        if (deque.isEmpty()) {
            System.out.println(-1);
        } else {
            System.out.println(deque.peekLast());
        }
    }

    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] command = br.readLine().split(" ");

            switch (command[0]) {
                case "push_front":
                    push_front(Integer.parseInt(command[1]));
                    break;
                case "push_back":
                    push_back(Integer.parseInt(command[1]));
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
            }
        }
    }
}
