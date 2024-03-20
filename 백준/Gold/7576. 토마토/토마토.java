import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = { -1, 0, 1, 0 };
	static int[] dc = { 0, 1, 0, -1 };		
	static int day;
	static int cnt;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		bfs(arr, visited, M, N);
		
		if(cnt == 0) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}
	
	static void bfs(int[][] arr, boolean[][] visited, int M, int N) {
		Queue<int[]> q = new LinkedList<>();		
		visited = new boolean[N][M];
		day = -1; // 다 익는데 걸리는 시간, while문에 들어갈때 +1 되기 때문에 -1로 초기화
		cnt = 0; // 안익은 토마토 수
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					q.offer(new int[] {i, j});
				} else if(arr[i][j] == 0) {
					cnt++;					
				}
			}
		}
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				int[] pos = q.poll();
				int r = pos[0];
				int c = pos[1];
				
				for(int dir = 0; dir < 4; dir++) {
					int nr = r + dr[dir];
					int nc = c + dc[dir];
					
					if(nr >= 0 && nr < N && nc >= 0 && nc < M && arr[nr][nc] == 0 && !visited[nr][nc]) {
						visited[nr][nc] = true;
						arr[nr][nc] = 1;
						q.offer(new int[] {nr, nc});
						cnt--;
					}
				}
			}
			day++;
		}
	}
}