import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][M];
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };		
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		Queue<int[]> q = new LinkedList<>();		
		boolean[][] visited = new boolean[N][M];
		int day = -1; // 다 익는데 걸리는 시간, while문에 들어갈때 +1 되기 때문에 -1로 초기화
		int cnt = 0; // 안익은 토마토 수
		
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
		
		if(cnt == 0) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}
}