import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N + 1][M + 1];
		
		for(int r = 1; r < N + 1; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c = 1; c < M + 1; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		int[][] dp = new int[N + 1][M + 1];
		
		for(int r = 1; r < N + 1; r++) {
			for(int c = 1; c < M + 1; c++) {
				dp[r][c] = Math.max(arr[r][c] + dp[r][c - 1], arr[r][c] + dp[r - 1][c]);
			}
		}
//		System.out.println(Arrays.deepToString(dp));
		System.out.println(dp[N][M]);
	}
}