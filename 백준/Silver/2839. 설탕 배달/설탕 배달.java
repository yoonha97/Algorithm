import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		
		if(N % 5 == 0) {
			count = N / 5;
		} else if(N % 5 == 1) {
			count = N / 5 + 1;
		} else if(N % 5 == 2 && N > 7) {
			count = N / 5 + 2;
		} else if(N % 5 == 3) {
			count = N / 5 + 1;
		} else if(N % 5 == 4 && N > 4) {
			count = N / 5 + 2;
		} else {
			count = -1;
		}
		
		System.out.println(count);
	}
}