import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		long[] cnt = new long[m];
		long ans = 0;
		long s= 0;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++){
			s += Integer.parseInt(st.nextToken());
			long a = s % m;
			if (a == 0) ans++;
			cnt[(int) a]++;
		}
		for (long i : cnt) {
			ans += i * (i - 1) / 2;
		}
		System.out.println(ans);
	}
}