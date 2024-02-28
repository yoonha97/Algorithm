import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
//		System.out.println(Arrays.toString(arr));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if(gender == 1) {
				boy(arr, num);
			} else if(gender == 2) {
				girl(arr, num);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < size; i++) {
			sb.append(arr[i]).append(" ");
			if((i + 1) % 20 == 0) {
				sb.append("\n");
			}
			if(i >= arr.length) {
				break;
			}
		}
		System.out.println(sb);
	}
	
	public static void boy(int[] arr, int num) {
		for(int i = num - 1; i < arr.length; i += num) {
			arr[i] = (arr[i] == 0) ? 1 : 0;
		}
	}
	
	public static void girl(int[] arr, int num) {
		int idx = num - 1;
		arr[idx] = (arr[idx] == 0) ? 1 : 0;
		
		int left = idx - 1;
		int right = idx + 1;
		while(left >= 0 && right < arr.length && arr[left] == arr[right]) {
			arr[left] = (arr[left] == 0) ? 1 : 0;
			arr[right] = (arr[right] == 0) ? 1 : 0;
			left--;
			right++;
		}
	}
}