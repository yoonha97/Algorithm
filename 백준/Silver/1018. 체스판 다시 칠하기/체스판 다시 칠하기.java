import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		boolean[][] arr = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < M; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;
				} else {
					arr[i][j] = false;
				}
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		int min = 64;
		for(int i = 0; i < N - 7; i++) {
			for(int j = 0; j < M - 7; j++) {
				boolean start = arr[i][j];
				int cnt = 0;
				for(int r = i; r < i + 8; r++) {
					for(int c = j; c < j + 8; c++) {
						if(arr[r][c] != start) {
							cnt++;
						}
						start = !start;
					}
					start = !start;
				}
				cnt = Math.min(cnt, 64 - cnt);
				min = Math.min(min, cnt);
			}
		}
		System.out.println(min);
	}
}