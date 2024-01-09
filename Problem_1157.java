import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Problem_1157 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);

        String s = br.readLine();
        s = s.toUpperCase();

        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'A']++;
        }

        int max = 0;
        int maxIndex = 0;
        boolean isSame = false;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                maxIndex = i;
                isSame = false;
            } else if (max == arr[i]) {
                isSame = true;
            }
        }

        if (isSame) {
            System.out.println("?");
        } else {
            System.out.println((char) (maxIndex + 'A'));
        }
    }
}