import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] map, dist;
	static boolean[][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new int[N][M];
		dist = new int[N][M];
		visited = new boolean[N][M];
		int startX = -1;
		int startY = -1;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 2) {
					startX = i;
					startY = j;
				} else if(map[i][j] == 0) {
					visited[i][j] = true;
				}
			}
		}
		
		bfs(startX, startY);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(map[i][j] == 1 && !visited[i][j]) {
					sb.append(-1).append(" ");
				} else {
					sb.append(dist[i][j]).append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}

	private static void bfs(int startX, int startY) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {startX, startY});
		visited[startX][startY] = true;
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int r = pos[0];
			int c = pos[1];
			
			for(int dir = 0; dir < 4; dir++) {
				int nr = r + dr[dir];
				int nc = c + dc[dir];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc]) {
					visited[nr][nc] = true;
					dist[nr][nc] = dist[r][c] + 1;
					q.offer(new int[] {nr, nc});
				}
			}
		}
	}
}