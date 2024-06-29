import java.util.*;

public class Programmers_42888 {

    public static String[] solution(String[] record) {
        Map<String, String> uidToNickName = new LinkedHashMap<>();
        List<String[]> logs = new ArrayList<>();

        for (String line : record) {
            String[] split = line.split(" ");
            String command = split[0];
            String uid = split[1];
            String nickname = split.length == 3 ? split[2] : "";

            if (command.equals("Enter")) {
                if (uidToNickName.containsKey(uid)) {
                    uidToNickName.replace(uid, nickname);
                } else {
                    uidToNickName.put(uid, nickname);
                }
                logs.add(new String[]{uid, "님이 들어왔습니다."});
            } else if (command.equals("Leave")) {
                logs.add(new String[]{uid, "님이 나갔습니다."});
            } else if (command.equals("Change")) {
                uidToNickName.put(uid, nickname);
            }
        }

        String[] answer = new String[logs.size()];
        int i = 0;
        for (String[] log : logs) {
            answer[i++] = uidToNickName.get(log[0]) + log[1];
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] chatLogs = {
                "Enter uid1234 Muzi",
                "Enter uid4567 Prodo",
                "Leave uid1234",
                "Enter uid1234 Prodo",
                "Change uid4567 Ryan"
        };
        System.out.println(Arrays.toString(solution(chatLogs)));
    }
}