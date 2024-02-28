import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int leftx = Integer.parseInt(st.nextToken());
			int lefty = Integer.parseInt(st.nextToken());

			for(int x = leftx; x < leftx + 10; x++) {
				for(int y = lefty; y < lefty + 10; y++) {
					arr[x][y] = 1;
				}
			}			
		}
		
		// 상 하 좌 우
		int[] dr = { -1, 1, 0, 0 };
		int[] dc = { 0, 0, -1, 1 };
		
		int answer = 0;
		for(int r = 0; r < arr.length; r++) {
			for(int c = 0; c < arr.length; c++) {
				for(int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					if(arr[r][c] == 1 && arr[nr][nc] == 0) {
						answer++;
					}	
				}
			}
		}
		System.out.println(answer);
	}
}