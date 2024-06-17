import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] fibo0 = new int[41];
			int[] fibo1 = new int[41];
			fibo0[0] = 1;
			fibo0[1] = 0;
			fibo1[0] = 0;
			fibo1[1] = 1;
			
			for(int i = 2; i <= N; i++) {
				fibo0[i] = fibo0[i - 1] + fibo0[i - 2];
				fibo1[i] = fibo1[i - 1] + fibo1[i - 2];
			}
			System.out.println(fibo0[N] + " " + fibo1[N]);
		}
	}
}