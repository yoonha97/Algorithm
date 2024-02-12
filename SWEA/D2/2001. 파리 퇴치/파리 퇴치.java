import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][N];
			
			for(int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c = 0; c < N; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			int sum = 0;
			int max = 0;
			
			for(int r = 0; r <= N - M; r++) {
				for(int c = 0; c <= N - M; c++) {
					sum = 0;
					for(int nr = 0; nr < M; nr++) {
						for(int nc = 0; nc < M; nc++) {
							sum += arr[r + nr][c + nc];
						}
						if(sum > max) {
							max = sum;
						}
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}