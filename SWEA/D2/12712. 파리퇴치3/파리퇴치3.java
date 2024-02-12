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
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					int target = arr[r][c];
					for(int l = 1; l < M; l++) {
						for(int d = 0; d < 4; d++) {
							int nr = r + (dr[d] * l);
							int nc = c + (dc[d] * l);
							if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
								target += arr[nr][nc];
							}
						}
					}
					if(target > sum) {
						sum = target;
					}
				}
			}
			
			int[] dr2 = {-1, -1, 1, 1};
			int[] dc2 = {-1, 1, -1, 1};
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					int target = arr[r][c];
					for(int l = 1; l < M; l++) {
						for(int d = 0; d < 4; d++) {
							int nr = r + (dr2[d] * l);
							int nc = c + (dc2[d] * l);
							if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
								target += arr[nr][nc];
							}
						}
					}
					if(target > sum) {
						sum = target;
					}
				}
			}
			
			System.out.println("#"+ tc + " " + sum);
		}
	}
}