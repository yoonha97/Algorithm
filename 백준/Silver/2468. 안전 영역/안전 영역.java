import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		int maxH = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				maxH = Math.max(maxH, arr[i][j]);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(maxH);

		int maxNum = 0;
		for (int setH = 0; setH < maxH; setH++) {
			int cnt = 0;
			Stack<int[]> stack = new Stack<>();
			boolean[][] visited = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] > setH && !visited[i][j]) {
						dfs(arr, visited, i, j, setH, N);
						cnt++;
					}
				}
			}
			maxNum = Math.max(maxNum, cnt);
		}
		System.out.println(maxNum);
	}

	public static void dfs(int[][] arr, boolean[][] visited, int r, int c, int h, int N) {
		visited[r][c] = true;

		for (int dir = 0; dir < 4; dir++) {
			int nr = r + dr[dir];
			int nc = c + dc[dir];

			if (nr >= 0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] > h && !visited[nr][nc]) {
				dfs(arr, visited, nr, nc, h, N);
			}
		}
	}
}