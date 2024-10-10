import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int dec = 0; // 소수 개수
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int cnt = 0; // 이게 올라가면 소수 x 
			int num = Integer.parseInt(st.nextToken());
			
			if (num == 1) {
				continue;
			}
			
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					cnt++;
				}
			}
			
			if(cnt == 0) {
				dec++;
			}
		}
		System.out.print(dec);
	}
}