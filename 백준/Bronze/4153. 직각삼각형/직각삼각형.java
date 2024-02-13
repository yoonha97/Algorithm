import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 0 && b == 0 && c == 0) {
				break;
			}
			
			if((a * a + b * b) == c * c) {
				System.out.println("right");
			} else if((b * b + c * c) == a * a) {
				System.out.println("right");
			} else if((c * c + a * a) == b * b) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		}
	}
}