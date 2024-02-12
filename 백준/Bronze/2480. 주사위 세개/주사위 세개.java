import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int M = 0;
		
		if(A == B && B == C) {
			M = 10000 + (1000 * A);
		} else if(A == B) {
			M = 1000 + (100 * A);
		} else if(B == C) {
			M = 1000 + (100 * B);
		} else if(C == A) {
			M = 1000 + (100 * C);
		} else {
			int max = Math.max(A, B);
			max = Math.max(max, C);
			M = max * 100;
		}
		
		System.out.println(M);
	}
}