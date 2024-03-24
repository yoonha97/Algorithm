import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	static int N, totalKcal, maxScore;
	static int[][] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			totalKcal = Integer.parseInt(st.nextToken());
			arr = new int[N][2];
			
			for(int n = 0; n < N; n++) {
				st = new StringTokenizer(br.readLine());
				arr[n][0] = Integer.parseInt(st.nextToken());
				arr[n][1] = Integer.parseInt(st.nextToken());
			}
			
			maxScore = 0;
			hamburger(0, 0, 0);
			System.out.println("#" + tc + " " + maxScore);
		}
	}
	
	public static void hamburger(int idx, int sumScore, int sumKcal) {
		if(sumKcal > totalKcal) {
			return;
		} else {
			maxScore = Math.max(maxScore, sumScore);
		}
		if(idx == N) {
			return;
		}
		
		hamburger(idx + 1, sumScore + arr[idx][0], sumKcal + arr[idx][1]);
		hamburger(idx + 1, sumScore, sumKcal);
	}
}