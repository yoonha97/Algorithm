import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int sum = 0;
		for(int i = 1; i <= N; i++) {
			int num = i;
			int rest = 0;
			
			while(num > 0) {
				rest += num % 10;
				num /= 10;				
			}
			
			if(rest + i == N) {
				sum = i;
				break;
			}
		}
		System.out.println(sum);
	}
}