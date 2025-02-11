import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int len = str.length();

		for(int i = 0; i <= len / 10; i++){
			System.out.println(str.substring(10 * i, Math.min(len, 10 * (i + 1))));
		}
	}
}