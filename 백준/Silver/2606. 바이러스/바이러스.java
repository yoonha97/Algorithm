import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int V, E, cnt;
	static int[][] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		V = Integer.parseInt(br.readLine());
		E = Integer.parseInt(br.readLine());
		arr = new int[V + 1][V + 1];
		visited = new boolean[V + 1];
		
		for(int e = 0; e < E; e++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r][c] = 1;
			arr[c][r] = 1;
		}
		
//		System.out.println(Arrays.deepToString(arr));

		cnt = 0;
		dfs(1);
		
		System.out.println(cnt);
		
	}

	private static void dfs(int i) {
		visited[i] = true;
		
		for(int j = 1; j < V + 1; j++) {
			if(arr[i][j] == 1 && !visited[j]) {
				cnt++;
				dfs(j);
			}
		}
	}
	
}