import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int time = Integer.parseInt(br.readLine());
		int m = M + time;
		
		while(m >= 60) {
			m -= 60;
			H++;
			if(H >= 24) {
				H -= 24;
			}
		}
		System.out.printf("%d %d", H, m);
	}
}