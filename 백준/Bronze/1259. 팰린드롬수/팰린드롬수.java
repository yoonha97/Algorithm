import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String str = br.readLine();
			if(str.equals("0")) {
				break;
			}
			
			int len = str.length();
			boolean Pal = true;
			for(int i = 0; i < (len / 2); i++) {
				if(str.charAt(i) != str.charAt(len - i - 1)) {
					Pal = false;
					break;
				}
			}
			if(Pal) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}