import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		map = new char[N][M];
		visited = new boolean[N][M];
		int startR = 0;
		int startC = 0;		
		
		for(int r = 0; r < N; r++) {
			String str = br.readLine();
			for(int c = 0; c < M; c++) {
				map[r][c] = str.charAt(c);
				if(map[r][c] == 'I') {
					startR = r;
					startC = c;
				}
			}
		}
		
		int result = bfs(startR, startC);
		
		if(result == 0) {
			System.out.println("TT");
		} else {
			System.out.println(result);
		}
	}

	private static int bfs(int startR, int startC) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {startR, startC});
		visited[startR][startC] = true;
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int pos[] = q.poll();
			int r = pos[0];
			int c = pos[1];
			
			for(int dir = 0; dir < 4; dir++) {
				int nr = r + dr[dir];
				int nc = c + dc[dir];
				
				if(nr >= 0 && nr < N && nc >= 0 && nc < M && !visited[nr][nc] && map[nr][nc] != 'X') {
					if(map[nr][nc] == 'P') {
						cnt++;
					}
					visited[nr][nc] = true;
					q.offer(new int[] {nr, nc});
				}
			}
		}
		return cnt;
	}
}