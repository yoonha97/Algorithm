import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[L + 1];
		
		int expectIdx = 0;
		int expectMax = 0;
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int p = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			if(expectMax < k - p + 1) {
				expectMax = k - p + 1;
				expectIdx = i;
			}
			
			for(int j = p; j <= k; j++) {
				if(arr[j] == 0) {
					arr[j] = i;
				}
			}
		}
		
		int[] count = new int[N + 1]; 
		for(int i = 0; i < L + 1; i++) {
			count[arr[i]]++;
		}
		
		int realIdx = 0;
		int realMax = 0;
		for(int i = 1; i < N + 1; i++) {
			if(realMax < count[i]) {
				realMax = count[i];
				realIdx = i;
			}
		}
		System.out.println(expectIdx);
		System.out.println(realIdx);
	}
}