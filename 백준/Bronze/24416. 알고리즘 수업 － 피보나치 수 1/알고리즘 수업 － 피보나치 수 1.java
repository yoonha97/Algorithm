import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		fibo(n); // 재귀
		sb.append(cnt).append(" ");
		
		int[] arr = new int[41]; // dp
		
		arr[1] = 1;
		arr[2] = 1;
		
		int count = 0;
		for(int i = 3; i <= n; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			count++;
		}
		sb.append(count);
		
		System.out.println(sb);
	}
	
	static int cnt = 0;
	public static int fibo(int N) {
		if(N <= 2) {
			cnt++;
			return 1;
		} else {
//			System.out.println(N);
			return fibo(N - 1) + fibo(N - 2);
		}
	}
}