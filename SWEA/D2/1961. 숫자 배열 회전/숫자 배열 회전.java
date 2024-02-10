import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[][] arr = new int[N][N];
			String[] result = new String[N];
			Arrays.fill(result, "");
			
			
			for(int r = 0; r < N; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int c = 0; c < N; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int c = 0; c < N; c++) {
				for(int r = N - 1; r >= 0; r--) {
					result[c] += Integer.toString(arr[r][c]);
				}
				result[c] += " ";
			}
			
			for(int r = N - 1; r >= 0; r--) {
				for(int c = N - 1; c >= 0; c--) {
					result[N - 1 - r] += Integer.toString(arr[r][c]);
				}
				result[N - 1 - r] += " ";
			}
			
			for(int c = N - 1; c >= 0; c--) {
				for(int r = 0; r < N; r++) {
					result[N - 1 -c] += Integer.toString(arr[r][c]);
				}
				result[N - 1 - c] += " ";
			}
			
			System.out.println("#" + tc);
			for(int i = 0; i < N; i++) {
				System.out.println(result[i]);
			}
		}
	}
}