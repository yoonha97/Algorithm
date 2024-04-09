import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int l;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = { -2, -1, 1, 2, 2, 1, -1, -2 };
	static int[] dc = { 1, 2, 2, 1, -1, -2, -2, -1 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			l = Integer.parseInt(br.readLine());
			arr = new int[l][l];
			visited = new boolean[l][l];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int curr = Integer.parseInt(st.nextToken());
			int curc = Integer.parseInt(st.nextToken());
			
			st = new StringTokenizer(br.readLine());
			int targetr = Integer.parseInt(st.nextToken());
			int targetc = Integer.parseInt(st.nextToken());
			
			int result = move(curr, curc, targetr, targetc);
			System.out.println(result);
		}
	}

	private static int move(int curr, int curc, int targetr, int targetc) {
		Queue<int[]> q = new LinkedList<>();
		q.add(new int[] {curr, curc, 0});
		visited[curr][curc] = true;
		
		while(!q.isEmpty()) {
			int[] pos = q.poll();
			int startr = pos[0];
			int startc = pos[1];
			int cnt = pos[2];
			
			if(startr == targetr && startc == targetc) {
				return cnt;
			}
						
			for(int dir = 0; dir < 8; dir++) {
				int newr = startr + dr[dir];
				int newc = startc + dc[dir];
				
				if(newr >= 0 && newr < l && newc >= 0 && newc < l && !visited[newr][newc]) {
					visited[newr][newc] = true;
					q.offer(new int[] {newr, newc, cnt + 1});
				}
			}
		}
		return -1;
	}
}