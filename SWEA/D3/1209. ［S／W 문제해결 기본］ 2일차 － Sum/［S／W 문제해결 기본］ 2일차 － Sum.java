import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[100][100];
			br.readLine();
			
			for(int r = 0; r < 100; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int c = 0; c < 100; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			int sum = 0;
			int max = 0;

			for(int r = 0; r < 100; r++) {
				sum = 0;
				for(int c = 0; c < 100; c++) {
					sum += arr[r][c];
				}
				if(sum > max) {
					max = sum;
				}
			}
			
			for(int c = 0; c < 100; c++) {
				sum = 0;
				for(int r = 0; r < 100; r++) {
					sum += arr[r][c];
				}
				if(sum > max) {
					max = sum;
				}
			}
			
			sum = 0;
			for(int i = 0; i < 100; i++) {
				sum += arr[i][i];
			}
			if(sum > max) {
				max = sum;
			}
			
			sum = 0;
			for(int i = 0; i < 100; i++) {
				sum += arr[i][99 - i];
			}
			if(sum > max) {
				max = sum;
			}
			
			System.out.println("#" + tc + " " + max);
		}
	}
}