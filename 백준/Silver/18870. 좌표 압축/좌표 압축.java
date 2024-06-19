import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int[] sorted = new int[N];
		HashMap<Integer, Integer> rankMap = new HashMap<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			nums[i] = sorted[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(sorted);
		
		int rank = 0;
		for(int n : sorted) {
			if(!rankMap.containsKey(n)) {
				rankMap.put(n, rank);
				rank++;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int n : nums) {
			sb.append(rankMap.get(n)).append(" ");
		}
		
		System.out.println(sb);
	}
}