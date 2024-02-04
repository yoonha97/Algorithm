import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[42];
		
		for(int j = 0; j < 10; j++) {
			int div = Integer.parseInt(br.readLine()) % 42;
			if(arr[div] == 0) {
				arr[div] = 1;
			}
		}
		
		int count = 0;
		for(int i = 0; i < 42; i++) {
			if(arr[i] == 1) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}