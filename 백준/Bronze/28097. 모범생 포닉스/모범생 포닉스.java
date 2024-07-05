import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int sum = (N - 1) * 8;
		
		while (st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken());
		}

		StringBuilder sb = new StringBuilder();
		sb.append(sum / 24).append(" ").append(sum % 24);
		System.out.println(sb);
	}
}