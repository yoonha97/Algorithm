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
		
		for(int i = 0; i < N; i++) {
			arr[i] = i + 1;
		}
		
		int temp = 0;
		
		for(int a = 0; a < M; a++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st2.nextToken());
			int j = Integer.parseInt(st2.nextToken());
			
			temp = arr[i-1];
			arr[i-1] = arr[j-1];
			arr[j-1] = temp;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}