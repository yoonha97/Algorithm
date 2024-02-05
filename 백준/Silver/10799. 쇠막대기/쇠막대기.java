import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int left = 0;
		int sum = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(') {
				left++;
			}
			if(ch == ')') {
				left--;
				
				if(str.charAt(i-1) == '(') {
					sum += left;
				} else {
					sum++;
				}
			}
		}
		
		System.out.println(sum);
		
	}
}