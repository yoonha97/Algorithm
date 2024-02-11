import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = 10;
		int[] arr = new int[100];
		
		for(int tc = 1; tc <= T; tc++) {
			int F = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < 100; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int f = 0; f < F; f++) {
				Arrays.sort(arr);
				arr[0]++;
				arr[99]--;
			}
			Arrays.sort(arr);
			System.out.println("#" + tc + " " + (arr[99] - arr[0]));
		}
		
	}
}