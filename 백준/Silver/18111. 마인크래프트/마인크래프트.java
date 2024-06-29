import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int R = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int I = Integer.parseInt(st.nextToken());
		int[][] map = new int[R][C];
		int max = 0;
		int min = 256;

		for (int r = 0; r < R; r++) {
			st = new StringTokenizer(br.readLine());
			for (int c = 0; c < C; c++) {
				map[r][c] = Integer.parseInt(st.nextToken());

				if (map[r][c] > max) {
					max = map[r][c];
				}

				if (map[r][c] < min) {
					min = map[r][c];
				}
			}
		}

		int time = Integer.MAX_VALUE;
		int height = 0;

		for (int i = min; i <= max; i++) {
			int count = 0;
			int block = I;

			for (int r = 0; r < R; r++) {
				for (int c = 0; c < C; c++) {
					
					if (map[r][c] > i) {
						count += (map[r][c] - i) * 2;
						block += map[r][c] - i;
					} else {
						count += i - map[r][c];
						block -= i - map[r][c];
					}
				}
			}
			
			if(block < 0) break;
			
			if(time >= count) {
				time = count;
				height = i;
			}
		}
		
		System.out.println(time + " " + height);
	}
}