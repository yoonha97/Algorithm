import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int[] arr;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		arr = new int[M];
		visited = new boolean[N];
		
		dfs(N, M, 0, 0);
		System.out.println(sb);
	}

	private static void dfs(int N, int M, int size, int start) {
		if(size == M) {
			for(int val : arr) {
				sb.append(val).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i = start; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[size] = i + 1;
				dfs(N, M, size + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}