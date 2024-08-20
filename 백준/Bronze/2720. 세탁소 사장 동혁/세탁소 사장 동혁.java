import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < T; i++) {
			int A = Integer.parseInt(br.readLine());
			int Q = A / 25;
			A = A - Q * 25;
			int D = A / 10;
			A = A - D * 10;
			int N = A / 5;
			A = A - N * 5;
			int P = A;
			sb.append(Q).append(" ").append(D).append(" ").append(N).append(" ").append(P).append("\n");
		}
		System.out.println(sb);
	}
}