import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int Q = Integer.parseInt(st.nextToken());
			int[] box = new int[N + 1];
			int[] L = new int[Q];
			int[] R = new int[Q];
			
			for(int q = 0; q < Q; q++) {
				st = new StringTokenizer(br.readLine());
				L[q] = Integer.parseInt(st.nextToken());
				R[q] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 0; i < Q; i++) {
				for(int j = L[i]; j <= R[i]; j++) {
					box[j] = i + 1;
				}
			}
//			System.out.println(Arrays.toString(box));
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append(" ");
			for(int i = 1; i < N + 1; i++) {
				sb.append(box[i]).append(" ");
			}
			System.out.println(sb);
		}
	}
}