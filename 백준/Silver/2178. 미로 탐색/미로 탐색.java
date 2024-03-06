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
		int N = Integer.parseInt(st.nextToken()); //행
		int M = Integer.parseInt(st.nextToken()); //열
		
		int[][] arr = new int[N][M];
		int[][] visited = new int[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				int road = str.charAt(j) - '0';
				arr[i][j] = road;
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		int[] dr = { 0, 1, 0, -1 }; //행
		int[] dc = { 1, 0, -1, 0 }; //열
		Queue<Integer> queue = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				//탐색하면서 그 칸이 1이면 visited 체크, 사방탐색
				if(arr[i][j] == 1 && visited[i][j] == 0) {
					visited[i][j] = 1;
					
					queue.offer(i);
					queue.offer(j);
					
					while(!queue.isEmpty()) {
						int y = queue.poll();
						int x = queue.poll();
						
						for(int dir = 0; dir < 4; dir++) {
							int nr = y + dr[dir];
							int nc = x + dc[dir];
							
							if(nr >= 0 && nr < N && nc >= 0 && nc < M && arr[nr][nc] == 1 && visited[nr][nc] == 0) {
								visited[nr][nc] = visited[y][x] + 1;
								queue.offer(nr);
								queue.offer(nc);
							}
						}
					}
				}
			}
		}
		System.out.println(visited[N-1][M-1]);
	}
}