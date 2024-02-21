import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] dp = new int[N + 1];
		int ans = 0;
		
		if(N % 2 == 1) {
			ans = 0;
		} else {
			dp[0] = 1;
			dp[2] = 3;

			for(int i = 4; i <= N + 1; i += 2) {
				dp[i] = dp[i - 2] * 3;
				for(int j = i - 4; j >= 0; j -= 2) {
					dp[i] += dp[j] * 2;
				}
			}
			ans = dp[N];
		}
		System.out.println(ans);
	}
}