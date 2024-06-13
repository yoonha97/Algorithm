import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[K];
		long max = 0;
		
		for(int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		
		long left = 1;
		long right = max;
		long result = 0;
		
		while(left <= right) {
			long mid = (left + right) / 2;
			long cnt = 0;
			
			for(int i = 0; i < arr.length; i++) {
				cnt += arr[i] / mid;
			}
			
			if (cnt >= N) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
		}
		
		System.out.println(result);
	}
}