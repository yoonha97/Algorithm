import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] arr = new int [2][7];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r][c]++;
		}
		
//		System.out.println(Arrays.deepToString(arr));
		
		int room = 0;
		
		for(int r = 0; r < 2; r++) {
			for(int c = 0; c < 7; c++) {
				if(arr[r][c] % K >0) {
					room += arr[r][c] / K + 1;					
				} else {
					room += arr[r][c] / K;
				}
			}
		}
		
		System.out.println(room);
	}
}