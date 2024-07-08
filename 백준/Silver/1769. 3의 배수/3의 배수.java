import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int cnt = 0;

		while (true) {
			long sum = 0;
			if (str.length() == 1) {
				break;
			}
			
			for(int i = 0; i < str.length(); i++) {
				sum += Integer.parseInt(String.valueOf(str.charAt(i)));
			}
			cnt++;
			str = String.valueOf(sum);
		}
		
		if(Integer.parseInt(String.valueOf(str)) % 3 == 0) {
			System.out.println(cnt);
			System.out.println("YES");
		} else {
			System.out.println(cnt);
			System.out.println("NO");
		}
	}
}