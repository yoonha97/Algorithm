import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[][] arr;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	static int cnt, maxSize;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		cnt = 0;
		maxSize = 0;
		boolean[][] visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {					
					int size = BFS(i, j, visited);
					
					if(size != 0) {
						cnt++;
						maxSize = Math.max(size, maxSize);
					}
				}
			}
		}
		
		System.out.println(cnt);
		System.out.println(maxSize);
	}

	private static int BFS(int i, int j, boolean[][] visited) {
		int size = 0;
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {i, j});
		visited[i][j] = true;

		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int curR = pos[0];
			int curC = pos[1];
			size++;
			
			for(int dir = 0; dir < 4; dir++) {
				int newR = curR + dr[dir];
				int newC = curC + dc[dir];
				
				if(newR >= 0 && newR < N && newC >= 0 && newC < M && arr[newR][newC] == 1 && !visited[newR][newC]) {
					visited[newR][newC] = true;
					q.offer(new int[] {newR, newC});
				}
			}
		}
		return size;
	}
}