import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		String str = br.readLine();
		int cnt = 0;
		int i = 0;
		int pattern = 0;

		while (i < M - 2) {
			if(str.charAt(i) == 'I' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'I'){
				pattern++;
				i += 2;
				if(pattern == N){
					cnt++;
					pattern--;
				}
			} else{
				pattern = 0;
				i++;
			}
		}

		System.out.println(cnt);
	}
}