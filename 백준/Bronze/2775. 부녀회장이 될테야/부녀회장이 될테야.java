import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			
			int[][] arr = new int[k + 1][n + 1];
			
			for(int i = 0; i < n + 1; i++) {
				arr[0][i] = i;
			}
			
			for(int r = 1; r < k + 1; r++) {
				int sum = 0;
				for(int c = 1; c < n + 1; c++) {
					sum += arr[r-1][c]; 
					arr[r][c] = sum;
				}
			}
			
			System.out.println(arr[k][n]);
		}
	}
}