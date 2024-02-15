import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int D = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		int F = Integer.parseInt(st.nextToken());
		
		sb.append(1 - A).append(" ").append(1 - B).append(" ").append(2 - C).append(" ").append(2 - D).append(" ").append(2 - E).append(" ").append(8 - F);
		System.out.println(sb);
	}
}