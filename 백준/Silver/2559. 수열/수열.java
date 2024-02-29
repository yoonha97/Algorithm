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
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(arr));
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i <= N - K; i++) {
			int temp = 0;
			for(int j = i; j < i + K; j++) {
				temp += arr[j];
//				System.out.println(temp);
			}
			if(max < temp) {
				max = temp;
			}
		}
		System.out.println(max);
	}
}