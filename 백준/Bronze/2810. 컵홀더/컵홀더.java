import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'L') {
				count++;
				i++;
			} else {
				count++;
			}
		}
		count = Math.min(count, N);
		System.out.println(count);
	}
}