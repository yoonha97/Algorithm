import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[100][100];
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			for(int nr = r; nr < r + 10; nr++) {
				for(int nc = c; nc < c + 10; nc++) {
					arr[nr][nc] = 1;
				}
			}
		}
		
		int sum = 0;
		for(int r = 0; r < 100; r++) {
			for(int c = 0; c < 100; c++) {
				sum += arr[r][c];
			}
		}
		
		System.out.println(sum);
	}
}
