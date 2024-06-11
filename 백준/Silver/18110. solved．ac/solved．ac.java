import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int except = (int) Math.round((float) N * 0.15);
		int[] arr = new int[N];

		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(br.readLine());
		}

		Arrays.sort(arr);

		float sum = 0;

		for(int i = except; i < N - except; i++){
			sum += arr[i];
		}

		System.out.println(Math.round(sum / (float) (N - except * 2)));

	}

}