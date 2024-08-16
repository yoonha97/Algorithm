import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] nums = new int[N];
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}

		int target = Integer.parseInt(br.readLine());

		Arrays.sort(nums);
		int i = 0;
		int j = N - 1;

		while(i < j) {
			int sum = nums[i] + nums[j];
			if(nums[i] >= target) break;

			if(sum > target) {
				j--;
			} else if(sum < target) {
				i++;
			} else {
				i++;
				j--;
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}