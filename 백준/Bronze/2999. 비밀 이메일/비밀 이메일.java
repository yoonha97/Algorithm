import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		int len = str.length();
		
		int R = 0;
		for(int i = 1; i <= Math.sqrt(len); i++) {
			if(len % i == 0) {
				R = i;
			}
		}
		int C = len / R;
//		System.out.println(R);
		
		int cnt = 0;
		char[][] arr = new char[R][C];
		for(int c = 0; c < C; c++) {
			for(int r = 0; r < R; r++) {
				arr[r][c] = str.charAt(cnt++);
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		for(int r = 0; r < R; r++) {
			for(int c = 0; c < C; c++) {
				sb.append(arr[r][c]);
			}
		}
		System.out.println(sb);
	}
}