import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String str = br.readLine();
            int[] clap = new int[str.length()];

            for (int i = 0; i < str.length(); i++) {
                clap[i] = str.charAt(i) - '0';
            }

            int sum = 0;
            int people = 0;
            for (int i = 0; i < str.length(); i++) {
//                System.out.println("i"+i+"  sum "+ sum + "  people:" + people);
                if (sum < i ) {
                     // 필요한 추가 인원 계산
                    int additional = i - sum;
                    // 추가 인원을 people에 더하고, sum에도 반영
                    people += additional;
                    sum += additional;
                }
                sum += clap[i];
            }
            System.out.println("#" + tc + " " + people);
        }
    }
}