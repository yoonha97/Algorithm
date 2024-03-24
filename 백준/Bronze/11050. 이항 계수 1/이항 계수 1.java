import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int top = 1;
		int bottom = 1;
		
		for(int i = 0; i < K; i++) {
			top *= N - i;
			bottom *= K - i;
		}
		
		System.out.println(top / bottom);
	}
}