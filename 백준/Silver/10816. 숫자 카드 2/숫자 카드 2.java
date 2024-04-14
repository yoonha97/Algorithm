import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < M; i++) {
			int num = Integer.parseInt(st.nextToken());
			sb.append(upperBound(arr, num) - lowerBound(arr, num)).append(" ");
		}
		
		System.out.println(sb);
	}
	
	private static int lowerBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
	 
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			
			if (key <= arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
	 
	private static int upperBound(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
	 
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (key < arr[mid]) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		return lo;
	}
}