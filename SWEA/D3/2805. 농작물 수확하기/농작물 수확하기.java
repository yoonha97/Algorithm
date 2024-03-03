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
			
			for(int r = 0; r < N; r++) {
				String str = br.readLine();
				for(int c = 0; c < N; c++) {
					arr[r][c] = str.charAt(c) - '0';
				}
			}
//			System.out.println(Arrays.deepToString(arr));
			
			int sum = 0;
			int left = N / 2;
			int right = N / 2;
			
			for(int r = 0; r < N / 2; r++) {
				for(int c = left; c <= right; c++) {
					sum += arr[r][c];
				}
				left--;
				right++;
			}
			
			for(int r = N / 2; r < N; r++) {
				for(int c = left; c <= right; c++) {
					sum += arr[r][c];
				}
				left++;
				right--;
			}
			System.out.println("#" + tc + " " + sum);
		}
	}
}