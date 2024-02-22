import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		int count = 1;
		int index = 1;
		
		while(true) {
			arr[index]++;
			if(arr[index] == M) {
				break;
			}
			
			if(arr[index] % 2 == 1) {
				index += L;
				if(index > N) {
					index -= N;
				}
			} else {
				index -= L;
				if(index <= 0) {
					index += N;
				}
			}
			count++;
		}
//		System.out.println(Arrays.toString(arr));
		System.out.println(count-1);
	}
}