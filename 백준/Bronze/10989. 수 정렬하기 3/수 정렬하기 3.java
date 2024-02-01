import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder st = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine()); // 개수 받기
		
		int[]arr = new int[N]; // 원본 배열
		int[]cnt = new int[10001]; // 정렬된 배열
		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
//		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < N; i++) {
			cnt[arr[i]]++;
		}
//		System.out.println(Arrays.toString(cnt));
		
		for(int i = 1; i <= 10000; i++) {
			for(int j = 0; j < cnt[i]; j++) {
				st.append(i + "\n");
			}
		}
		System.out.println(st);
	}
}