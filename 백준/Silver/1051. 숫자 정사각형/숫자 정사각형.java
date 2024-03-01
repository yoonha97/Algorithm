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
		int[][] arr = new int[N][M];
		
		for(int n = 0; n < N; n++) {
			String str = br.readLine();
			for(int m = 0; m < M; m++) {
				arr[n][m] = str.charAt(m) - '0';
			}
		}
//		System.out.println(Arrays.deepToString(arr));
		
		int size = Math.min(N, M);
//		System.out.println(size);
		boolean find = false;
		while(true) {
			for(int n = 0; n <= N - size; n++) {
				for(int m = 0; m <= M - size; m++) {
					if((arr[n][m] == arr[n][m + size - 1]) && (arr[n][m] == arr[n + size - 1][m]) && (arr[n][m] == arr[n + size - 1][m + size - 1])) {
						find = true;
						break;
					}
				}
				if(find) {
					break;
				}
			}
			if(find) {
				break;
			}
			size--;
			if(size == 1) {
				break;
			}
		}
//		System.out.println(size);
		int answer = size * size;
		System.out.println(answer);
	}
}