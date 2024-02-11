import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M - 45 < 0) {
			H = H - 1;
			M = M + 15;
			if(H < 0) {
				H = H + 24;
			}
		} else {
			M = M - 45;
		}
		
		System.out.println(H + " " + M);
	}
}