import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
			
			if(nums[i] > max) {
				max = nums[i];
			}
			
			if(nums[i] < min) {
				min = nums[i];
			}
		}
		
		System.out.printf("%d %d", min, max);
		
	}
}