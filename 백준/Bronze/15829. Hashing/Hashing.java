import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long sum = 0;
		long pow = 1;
		for(int i = 0; i < len; i++) {
			sum += (str.charAt(i) - 'a' + 1) * pow;
			pow = (pow * 31) % 1234567891;
		}
		
		System.out.println(sum % 1234567891);
	}
}