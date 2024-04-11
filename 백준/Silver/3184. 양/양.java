import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C, Vsum, Osum;
	static char[][] map;
	static boolean[][] visited;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visited = new boolean[R][C];
		
		for(int r = 0; r < R; r++) {
			String str = br.readLine();
			for(int c = 0; c < C; c++) {
				map[r][c] = str.charAt(c);
			}
		}
		
		for(int r = 0; r < R; r++) {
			for(int c = 0; c < C; c++) {
				if(!visited[r][c] && map[r][c] != '#') {
					int[] result = dfs(r, c);
					if(result[1] > result[0]) {
						Osum += result[1];
					} else {
						Vsum += result[0];
					}
				}
			}
		}
		
		System.out.println(Osum + " " + Vsum);
	}

	private static int[] dfs(int r, int c) {
		if (r < 0 || r >= R || c < 0 || c >= C || map[r][c] == '#' || visited[r][c])
            return new int[]{0, 0};
		
		visited[r][c] = true;
		int Vcnt = 0;
		int Ocnt = 0;
		
		if(map[r][c] == 'v') Vcnt++;
		else if(map[r][c] == 'o') Ocnt++;
		
		for(int dir = 0; dir < 4; dir++) {
			int nr = r + dr[dir];
			int nc = c + dc[dir];
			int[] temp = dfs(nr, nc);
			
			Vcnt += temp[0];
			Ocnt += temp[1];			
		}
		return new int[]{Vcnt, Ocnt};
	}
}