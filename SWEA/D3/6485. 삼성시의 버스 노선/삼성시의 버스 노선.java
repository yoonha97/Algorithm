import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			int[] arrA = new int[N];
			int[] arrB = new int[N];
			int[] cnt = new int[5001];
			
			for(int n = 0; n < N; n++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				arrA[n] = Integer.parseInt(st.nextToken());
				arrB[n] = Integer.parseInt(st.nextToken());
			}
//			System.out.println(Arrays.toString(arrA));
//			System.out.println(Arrays.toString(arrB));
			
			for(int i = 0; i < N; i++) {
				for(int j = arrA[i]; j <= arrB[i]; j++) {
					cnt[j]++;
				}
			}
//			System.out.println(Arrays.toString(cnt));
			
			int P = Integer.parseInt(br.readLine());
			int[] arrC = new int[P];
			for(int i = 0; i < P; i++) {
				arrC[i] = Integer.parseInt(br.readLine());
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append(" ");
			for(int i = 0; i < P; i++) {
				sb.append(cnt[arrC[i]]).append(" ");
			}
			System.out.println(sb);
		}
	}
}