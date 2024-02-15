import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();
		int result = 1;
		
		for(int i = 0; i < len / 2; i++) {
			if(str.charAt(i) != str.charAt(len - 1 - i)) {
				result = 0;
			}
		}
		System.out.println(result);
	}
}