import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, C;
	static char[][] arr;
	static int[] dr = { 0, 1, 0, -1 };
	static int[] dc = { 1, 0, -1, 0 };
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		arr = new char[R][C];
		
		for(int r = 0; r < R; r++) {
			String str = br.readLine();
			for(int c = 0; c < C; c++) {
				arr[r][c] = str.charAt(c);
			}
		}
		
		boolean flag = true;
		for(int r = 0; r < R; r++) {
			for(int c = 0; c < C; c++) {
				if(arr[r][c] == 'W') {
					for(int dir = 0; dir < 4; dir++) {
						int nr = r + dr[dir];
						int nc = c + dc[dir];
						
						if(nr >= 0 && nr < R && nc >= 0 && nc < C) {
							if(arr[nr][nc] == 'S') {
								flag = false;
							}
							
							if(arr[nr][nc] == '.') {
								arr[nr][nc] = 'D';
							}
						}
					}
				}
			}
		}
		
		if(!flag) {
			System.out.println(0);
		} else {
			System.out.println(1);
			for(int r = 0; r < R; r++) {
				for(int c = 0; c < C; c++) {
					System.out.print(arr[r][c]);
				}
				System.out.println();
			}
		}
		
	}
}