import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			int num = 0;
			int sum = 0;
			
			String str = br.readLine();
			
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'O') {
					num++;
					sum += num;
				} else {
					num = 0;
				}
			}
			System.out.println(sum);
		}
	}
}