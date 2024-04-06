import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N, M, ans;
	static int[][] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][N + 1];
		visited = new boolean[N + 1];
		ans = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = arr[b][a] = 1;
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visited[i]) {
				dfs(i);
				ans++;
			}
		}
		
		System.out.println(ans);
	}

	private static void dfs(int i) {
		visited[i] = true;
		
		for(int x = 0; x < N + 1; x++) {
			if(arr[i][x] == 1 && !visited[x]) {
				dfs(x);
			}
		}
	}
}