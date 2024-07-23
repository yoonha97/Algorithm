import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int tc = 0; tc < T; tc++) {
			int A = Integer.parseInt(br.readLine());
			if(Math.abs(A) % 2 == 0) {
				sb.append(A).append(" is even");
			} else {
				sb.append(A).append(" is odd");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}