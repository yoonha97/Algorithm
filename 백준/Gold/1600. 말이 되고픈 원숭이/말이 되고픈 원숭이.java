import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int K, C, R, min;
	static int[][] arr;
	static boolean[][][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	static int[] horseR = { 1, 2, 2, 1, -1, -2, -2, -1 };
	static int[] horseC = { 2, 1, -1, -2, -2, -1, 1, 2 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		C = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		arr = new int[R][C];
		
		for(int r = 0; r < R; r++) {
			st = new StringTokenizer(br.readLine());
			for(int c = 0; c < C; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		min = Integer.MAX_VALUE;
		visited = new boolean[R][C][K + 1];
		
		bfs(0, 0);
		
		if(min == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(min);
		}
		
	}
	
	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		visited[r][c][0] = true;
		q.offer(new int[] {r, c, 0, 0});
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int cr = pos[0];
			int cc = pos[1];
			int horse = pos[2];
			int count = pos[3];
			
			if(cr == R - 1 && cc == C - 1) {
				if(min > count) {
					min = count;
				}
			}
			
			for(int dir = 0; dir < 4; dir++) {
				int nr = cr + dr[dir];
				int nc = cc + dc[dir];
				
				if(nr >= 0 && nr < R && nc >= 0 && nc < C) {
					if(arr[nr][nc] == 0 && !visited[nr][nc][horse]) {
						visited[nr][nc][horse] = true;
						q.offer(new int[] {nr, nc, horse, count + 1});
					}
				}
			}
			
			if(horse < K) {
				for(int dir = 0; dir < 8; dir++) {
					int nr = cr + horseR[dir];
					int nc = cc + horseC[dir];
					
					if(nr >= 0 && nr < R && nc >= 0 && nc < C) {
						if(arr[nr][nc] == 0 && !visited[nr][nc][horse + 1]) {
							visited[nr][nc][horse + 1] = true;
							q.offer(new int[] {nr, nc, horse + 1, count + 1});
						}
					}
				}
			}
		}
	}
}