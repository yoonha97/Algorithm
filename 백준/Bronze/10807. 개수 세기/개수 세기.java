import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int[] nums = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());

		for(int i = 0; i < size; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		
		int target = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == target) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}