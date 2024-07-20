import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int ans = 1;
		
		while(A != B) {
			if(B < A) {
				ans = -1;
				break;
			}
			
			if(B % 2 == 0) {
				B /= 2;
				ans++;
			} else if(B % 10 == 1) {
				B /= 10;
				ans++;
			} else {
				ans = -1;
				break;
			}
		}
		
		System.out.println(ans);
	}
}