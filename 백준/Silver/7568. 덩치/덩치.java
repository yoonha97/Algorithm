import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] arr = new int[N][2];
		
		for(int r = 0; r < N; r++) {
			for(int c = 0; c < 2; c++) {
				arr[r][c] = sc.nextInt();
			}
		}
		
//		System.out.println(Arrays.deepToString(arr));
		
		StringBuilder sb = new StringBuilder();
		
		for(int r = 0; r < N; r++) {
			int cnt = 1;
			for(int comp = 0; comp < N; comp++) {
				if((arr[r][0] < arr[comp][0]) && (arr[r][1] < arr[comp][1])) {
					cnt++;
				}
			}
			sb.append(cnt).append(" ");
		}
		
		System.out.println(sb);
	}
}