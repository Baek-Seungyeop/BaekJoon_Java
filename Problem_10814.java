import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

class Member {
    int age;
    String name;

    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}
public class Problem_10814 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        int N = Integer.parseInt(br.readLine());

        ArrayList<Member> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            list.add(new Member(age, name));
        }

        // list.sort(new Comparator<Member>()
        Collections.sort(list, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                // return Integer.compare(o1.age, o2.age);

                if (o1.age > o2.age) {
                    return 1;
                } else if (o1.age < o2.age) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        StringBuilder sb = new StringBuilder();

        for (Member member : list) {
            sb.append(member.age).append(" ").append(member.name).append("\n");
        }

        System.out.println(sb);
    }
}
