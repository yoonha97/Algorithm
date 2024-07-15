import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static int[] arr;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
		
		generate(0, 1);
	}

	private static void generate(int depth, int start) {
		if(depth == M) {
			for(int num : arr) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = start; i <= N; i++) {
			arr[depth] = i;
			generate(depth + 1, i);
		}
	}
}