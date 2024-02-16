import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int count = 0;
		
		start: for(int tc = 0; tc < T; tc++) {
			String str = br.readLine();
			int len = str.length();
			
			boolean[] arr = new boolean[26];
			
			for(int i = 0; i < len; i++) {
				char ch = str.charAt(i);
				if(arr[ch - 'a'] == true) {
					continue start;
				}
				if(i < len - 1 && ch != str.charAt(i + 1)) {
					arr[ch - 'a'] = true;
				}
			}
			count++;
		}
		System.out.println(count);
		
	}
}
