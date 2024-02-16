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
					int multi = arr[i] * arr[j];
					
					String mulstr = String.valueOf(multi);
					boolean increasing = true;
					char prev = mulstr.charAt(0);
					
					for(int d = 1; d < mulstr.length(); d++) {
						char curr = mulstr.charAt(d);
						
						if(curr < prev) {
							increasing = false;
							break;
						}
						prev = curr;
					}
					
					if(increasing == true && max < multi) {
						max = multi;
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