import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arr = new int[N];
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			int max = 0;
			for(int i = 0; i < N - 1; i++) {
				for(int j = i + 1; j < N; j++) {
					int mul = arr[i] * arr[j];
					String str = String.valueOf(mul);
					
					char prev = str.charAt(0);
					boolean increasing = true;
					for(int x = 1; x < str.length(); x++) {
						char curr = str.charAt(x);
						if(prev > curr) {
							increasing = false;
							break;
						}
						prev = curr;
					}
					if(increasing == true && max < mul) {
						max = mul;
					}
					if(max == 0) {
						max = -1;
					}
				}
			}
			System.out.println("#" + tc + " " + max);
		}
	}
}