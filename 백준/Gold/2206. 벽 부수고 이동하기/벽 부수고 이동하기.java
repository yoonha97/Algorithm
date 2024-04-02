import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, min;
	static int[][] arr;
	static boolean[][][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][M + 1];
		visited = new boolean[N + 1][M + 1][2];
		min = Integer.MAX_VALUE;
		
		for(int r = 1; r < N + 1; r++) {
			String str = br.readLine();
			for(int c = 1; c < M + 1; c++) {
				arr[r][c] = str.charAt(c - 1) - '0';
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		bfs(1, 1);
		
		if(min == Integer.MAX_VALUE) {
			System.out.println("-1");
		} else {
			System.out.println(min);
		}
		
	}
	
	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<>();
		visited[r][c][0] = true;
		q.offer(new int[] {r, c, 0, 1}); // r, c, 벽, 거리
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int cr = pos[0];
			int cc = pos[1];
			int cnt = pos[2];
			int dist = pos[3];
			
			if(cr == N && cc == M) {
				if(min > dist) {
					min = dist;
				}
			}
			
			for(int dir = 0; dir < 4; dir++) {
				int nr = cr + dr[dir];
				int nc = cc + dc[dir];
				
				if(nr >= 1 && nr < N + 1 && nc >= 1 && nc < M + 1) {
					if(arr[nr][nc] == 0 && !visited[nr][nc][cnt]) { // 벽X
						visited[nr][nc][cnt] = true;
						q.offer(new int[] {nr, nc, cnt, dist + 1});
					}
					
					if(arr[nr][nc] == 1 && cnt == 0 && !visited[nr][nc][cnt + 1]) { // 벽O
						visited[nr][nc][cnt + 1] = true;
						q.offer(new int[] {nr, nc, cnt + 1, dist + 1});
					}
				}
			}
		}
	}
}