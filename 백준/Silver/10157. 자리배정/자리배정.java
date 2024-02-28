import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int C = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		int[][] arr = new int[R][C];
		
//		System.out.println(Arrays.deepToString(arr));
		
		int[] dr = { -1, 0, 1, 0 };
		int[] dc = { 0, 1, 0, -1 };
		int cnt = 1;
		int r = R - 1;
		int c = 0;
		int d = 0;
		
		while(cnt <= R * C) {
			arr[r][c] = cnt++;
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			if(nr < 0 || nr >= R || nc < 0 || nc >= C || arr[nr][nc] != 0) {
				d = (d + 1) % 4;
				nr = r + dr[d];
				nc = c + dc[d];
			}
			r = nr;
			c = nc;
		}
		
//		System.out.println(Arrays.deepToString(arr));
		
		int target = Integer.parseInt(br.readLine());
		int targetR = 0;
		int targetC = 0;
		boolean find = false;
		for(int i = 0; i < R; i++) {
			for(int j = 0; j < C; j++) {
				if(arr[i][j] == target) {
					targetR = j + 1;
					targetC = R - i;
					find = true;
					break;
				}
			}
			if(find) {
				break;
			}
		}
		if(find) {
			System.out.println(targetR + " " + targetC);
		} else {
			System.out.println(0);
		}
	}
}