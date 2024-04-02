import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	static int N;
	static int[][] arr;
	static int[][] time;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			time = new int[N][N];
			
			for(int r = 0; r < N; r++) {
				String str = br.readLine();
				for(int c = 0; c < N; c++) {
					arr[r][c] = str.charAt(c) - '0';
					time[r][c] = Integer.MAX_VALUE;
				}
			}
			
			int result = bfs(0, 0);
			
			if(result == -1)
				System.out.println("#" + tc + " " + result);
			else
				System.out.println("#" + tc + " " + time[N - 1][N - 1]);
		}
	}
	
	static int bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();		
		q.offer(new int[] {r, c});
		time[r][c] = arr[r][c];
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int cr = pos[0];
			int cc = pos[1];
			
			for(int dir = 0; dir < 4; dir++) {
				int nr = cr + dr[dir];
				int nc = cc + dc[dir];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < N) {
					int next = time[cr][cc] + arr[nr][nc];
					
					if(next < time[nr][nc]) {
						time[nr][nc] = next;
						q.offer(new int[] {nr, nc});
					}
				}
			}
		}
		
		if(time[N - 1][N - 1] == Integer.MAX_VALUE)
			return -1;
		else
			return 1;
	}
}