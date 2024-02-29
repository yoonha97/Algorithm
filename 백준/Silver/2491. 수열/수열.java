import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		int[] arr = new int[size];
		
		int max = 1;
		int increasing = 1;
		int decreasing = 1;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr[0] = Integer.parseInt(st.nextToken());
		for(int i = 1; i < size; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(arr[i] > arr[i - 1]) {
				increasing++;
				decreasing = 1;
			} else if(arr[i] < arr[i - 1]) {
				decreasing++;
				increasing = 1;
			} else if(arr[i] == arr[i - 1]) {
				increasing++;
				decreasing++;
			}
			max = Math.max(max, Math.max(increasing, decreasing));
		}
		System.out.println(max);		
	}
}