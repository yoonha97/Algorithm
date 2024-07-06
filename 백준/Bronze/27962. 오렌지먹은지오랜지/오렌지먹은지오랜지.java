import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		boolean res = false;
		
		for(int len = 1; len < N; len++) {
			String front = str.substring(0, len);
			String back = str.substring(N - len);
			
			int dif = 0;
			for(int i = 0; i < len; i++) {
				if(front.charAt(i) != back.charAt(i)) {
					dif++;
				}
				if(dif > 1) break;
			}
			
			if(dif == 1) {
				res = true;
				break;
			}
		}
		
		if(res) System.out.println("YES");
		else System.out.println("NO");
	}
}