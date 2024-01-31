import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String word = br.readLine();
		
		for(int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			
			if(Character.isUpperCase(c)) {
				System.out.print(String.valueOf(c).toLowerCase());
			} else {
				System.out.print(String.valueOf(c).toUpperCase());
			}
		}
	}
}