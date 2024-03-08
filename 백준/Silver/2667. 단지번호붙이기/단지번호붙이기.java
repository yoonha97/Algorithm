import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] arr = new int[N][N];
		boolean[][] visited = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j) - '0';
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		int[] dr = { 0, 1, 0, -1 };
		int[] dc = { 1, 0, -1, 0 };
		ArrayList<Integer> list = new ArrayList<>(); 
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				Queue<int[]> q = new LinkedList<>();
				int cnt = 0;
				
				if(arr[i][j] == 1 && !visited[i][j]) {
					visited[i][j] = true;
					q.offer(new int[] {i, j});
					cnt++;
					
					while(!q.isEmpty()) {
						int[] pos = q.poll();

						for(int dir = 0; dir < 4; dir++) {
							int nr = pos[0] + dr[dir];
							int nc = pos[1] + dc[dir];
							
							if(nr >= 0 && nr < N && nc >= 0 && nc < N && arr[nr][nc] == 1 && !visited[nr][nc]) {
								visited[nr][nc] = true;
								q.offer(new int[] {nr, nc});
								cnt++;
							}
						}
					}
				}
				if(cnt != 0) {					
					list.add(cnt);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}