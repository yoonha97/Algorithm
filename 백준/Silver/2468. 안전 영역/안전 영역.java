import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		int maxH = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				maxH = Math.max(maxH, arr[i][j]);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
//		System.out.println(maxH);
		
		int maxNum = 0;
		for(int setH = 0; setH < maxH; setH++) {
			int cnt = 0;
			Queue<int[]> queue = new LinkedList<>();
			boolean[][] visited = new boolean[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] > setH && !visited[i][j]) {
						visited[i][j] = true;
						cnt++;
						
						queue.offer(new int[] {i, j});
						
						while(!queue.isEmpty()) {
							int[] pos = queue.poll();
							
							for(int dir = 0; dir < 4; dir++) {
								int nr = pos[0] + dr[dir];
								int nc = pos[1] + dc[dir];
								
								if(nr >= 0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] > setH && !visited[nr][nc]) {
									visited[nr][nc] = true;
									queue.offer(new int[] {nr, nc});
								}
							}
						}
					}
				}
			}
			maxNum = Math.max(maxNum, cnt);
		}
		System.out.println(maxNum);
	}
}