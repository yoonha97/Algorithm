import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[N];
		
		for(int m = 0; m < M; m++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			int k = Integer.parseInt(st2.nextToken());
			
			for(int n = i-1; n < j; n++) {
				arr[n] = k;
			}
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}