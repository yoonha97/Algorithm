import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int answer = factorial(N) / ((factorial(K)) * (factorial(N - K)));
		System.out.println(answer);
	}
	
	static int factorial(int X) {
		if(X <= 1) {
			return 1;
		} else {
			return X * factorial(X - 1);
		}
	}
}