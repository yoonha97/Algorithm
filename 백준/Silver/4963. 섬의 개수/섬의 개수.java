import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] dx = { 1, 1, 0, -1, -1, -1, 0, 1 };
		int[] dy = { 0, -1, -1, -1, 0, 1, 1, 1 };
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			int cnt = 0;
			
			if(w == 0 && h == 0) break;
			
			int[][] arr = new int[h][w];
			boolean[][] visited = new boolean[h][w];
			
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(arr[i][j] == 1 && !visited[i][j]) {
						visited[i][j] = true;
						cnt++;
						
						Stack<Integer> stack = new Stack<>();
						
						stack.add(i);
						stack.add(j);
						
						while(!stack.isEmpty()) {
							int x = stack.pop();
							int y = stack.pop();
							
							for(int dir = 0; dir < 8; dir++) {
								int nx = x + dx[dir];
								int ny = y + dy[dir];
								
								if (ny >= 0 && ny < h && nx >= 0 && nx < w && arr[ny][nx] == 1 && !visited[ny][nx]) {
                                    visited[ny][nx] = true;
                                    
                                    stack.add(ny);
                                    stack.add(nx);
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