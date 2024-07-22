import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[3];
		int sum = 0;
		String str = "";
		
		for(int i = 0; i < 3; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		if(sum == 180) {
			if(arr[0] == arr[2]) {
				str = "Equilateral";
			} else if(arr[0] == arr[1] || arr[1] == arr[2]) {
				str = "Isosceles";
			} else {
				str = "Scalene";
			}
		} else {
			str = "Error";
		}
		
		System.out.println(str);
	}
}