import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sumS = 0;
		int sumT = 0;
		int ans = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++){
			sumS += Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++){
			sumT += Integer.parseInt(st.nextToken());
		}

		ans = Math.max(sumS, sumT);
		System.out.println(ans);
	}
}