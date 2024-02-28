import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int sum = 0;
		
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		boolean find = false;
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {
				if(arr[i] + arr[j] == sum - 100) {
					arr[i] = 0;
					arr[j] = 0;
					find = true;
					break;
				}
			}
			if(find) {
				break;
			}
		}
		Arrays.sort(arr);
		
		for(int i = 2; i < 9; i++) {
			System.out.println(arr[i]);
		}
	}
}