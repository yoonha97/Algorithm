import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = {0, 1, 0, -1};
	static int[] dc = {1, 0, -1, 0};
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		map = new char[N][N];
		visited = new boolean[N][N];

		for(int i = 0; i < N; i++){
			String str = br.readLine();
			for(int j = 0; j < N; j++){
				map[i][j] = str.charAt(j);
			}
		}

		StringBuilder sb = new StringBuilder();

		int cnt = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(!visited[i][j]){
					DFS(i, j, map[i][j]);
					cnt++;
				}
			}
		}
		sb.append(cnt).append(" ");

		visited = new boolean[N][N];
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(map[i][j] == 'R'){
					map[i][j] = 'G';
				}
			}
		}

		cnt = 0;
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				if(!visited[i][j]){
					DFS(i, j, map[i][j]);
					cnt++;
				}
			}
		}
		sb.append(cnt);

		System.out.println(sb);
	}

	private static void DFS(int r, int c, char color) {
		visited[r][c] = true;

		for(int dir = 0; dir < 4; dir++){
			int nr = r + dr[dir];
			int nc = c + dc[dir];

			if(nr >= 0 && nr < N && nc >= 0 && nc < N){
				if(!visited[nr][nc] && map[nr][nc] == color){
					DFS(nr, nc, map[nr][nc]);
				}
			}
		}
	}
}