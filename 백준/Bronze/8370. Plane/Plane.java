import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer A = Integer.parseInt(st.nextToken());
		Integer B = Integer.parseInt(st.nextToken());
		Integer C = Integer.parseInt(st.nextToken());
		Integer D = Integer.parseInt(st.nextToken());
		
		System.out.println(A * B + C * D);
	}
}