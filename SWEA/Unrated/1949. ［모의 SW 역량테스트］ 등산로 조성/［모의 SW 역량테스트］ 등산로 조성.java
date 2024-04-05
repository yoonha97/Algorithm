import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, K, maxlen;
	static int[][] map;
	static boolean[][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			maxlen = 0;
			
			int max = 0;
			for(int r = 0; r < N; r++) {
				st = new StringTokenizer(br.readLine());
				for(int c = 0; c < N; c++) {
					map[r][c] = Integer.parseInt(st.nextToken());
					max = Math.max(max, map[r][c]);
				}
			}
			
			for(int r = 0; r < N; r++) {
				for(int c = 0; c < N; c++) {
					if(map[r][c] == max) {
						visited = new boolean[N][N];
						dfs(r, c, 1, false);
					}
				}
			}
			
			System.out.println("#" + tc + " " + maxlen);
		}
		
	}
	
	static void dfs(int r, int c, int len, boolean cons) {
		visited[r][c] = true;
		
		for(int dir = 0; dir < 4; dir++) {
			int newr = r + dr[dir];
			int newc = c + dc[dir];
			
			if(newr >= 0 && newr < N && newc >= 0 && newc < N && !visited[newr][newc]) {
				if(map[newr][newc] < map[r][c]) {
					dfs(newr, newc, len + 1, cons);
				} else {
					if(!cons && (map[newr][newc] - K) < map[r][c]) {
						int temp = map[newr][newc];
						map[newr][newc] = map[r][c] - 1;
						dfs(newr, newc, len + 1, true);
						map[newr][newc] = temp;
					}
				}
			}
		}
		maxlen = Math.max(len, maxlen);
		visited[r][c] = false;
	}
}