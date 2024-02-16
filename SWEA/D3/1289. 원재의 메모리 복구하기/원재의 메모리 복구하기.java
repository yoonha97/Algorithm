import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			String str = br.readLine();
			
			int count = 0;
			char[] chars = str.toCharArray();
			for(int i = 0; i < str.length(); i++) {
				if(chars[i] == '1') {
					for(int j = i; j < str.length(); j++) {
						if(chars[j] == '0') {
							chars[j] = '1';
						} else {
							chars[j] = '0';
						}
					}
					count++;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}
}