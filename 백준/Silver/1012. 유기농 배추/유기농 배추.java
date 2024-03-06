import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			int[][] arr = new int[N][M];
			boolean[][] visited = new boolean[N][M];
			int cnt = 0;
			
			for(int k = 0; k < K; k++) {
				st = new StringTokenizer(br.readLine());
				int y = Integer.parseInt(st.nextToken());
				int x = Integer.parseInt(st.nextToken());
				arr[x][y] = 1;
			}
			
			for(int x = 0; x < N; x++) {
				for(int y = 0; y < M; y++) {
					if (arr[x][y] == 1 && !visited[x][y]) {
						visited[x][y] = true;
						cnt++;
						
						Queue<Integer> queue = new LinkedList<>();
						
						queue.offer(x);
						queue.offer(y);
					
						while(!queue.isEmpty()) {
							int X = queue.poll();
							int Y = queue.poll();
							
							for(int dir = 0; dir < 4; dir++) {
								int nx = X + dx[dir]; 
								int ny = Y + dy[dir];
								
								if(nx >= 0 && nx < N && ny >= 0 && ny < M && arr[nx][ny] == 1 && !visited[nx][ny]) {
									visited[nx][ny] = true;
									queue.offer(nx);
									queue.offer(ny);
								}
							}
						}
					}
				}
			}
			System.out.println(cnt);
		}
	}
}