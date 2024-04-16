import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int len = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		long sum = 0;
		for(int i = 0; i < len; i++) {
			long hash = (long) ((str.charAt(i) - 'a' + 1) * (Math.pow(31, i)));
			sum += hash;
		}
		
		System.out.println(sum % 1234567891);
	}
}