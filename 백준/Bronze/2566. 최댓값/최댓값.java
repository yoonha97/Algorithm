import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[9][9];
		int max = 0;
		
		for(int r = 0; r < 9; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c= 0; c < 9; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
		
		int R = 1;
		int C = 1;
		
		for(int r = 0; r < 9; r++) {
			for(int c = 0; c < 9; c++) {
				if(arr[r][c] > max) {
					max = arr[r][c];
					R = r + 1;
					C = c + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.printf("%d %d", R, C);
	}
}