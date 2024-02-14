import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		double[] arr = new double[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}
		
		Arrays.sort(arr);
		double sum = 0;
		
		for(int i = 0; i < N; i++) {
			sum += ((arr[i] / arr[N - 1]) * 100);
		}
		
		System.out.println(sum / N);
	}
}
