import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int N, M, V;
	static int[][] arr;
	static boolean[] visited;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		arr = new int[N + 1][N + 1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			arr[r][c] = 1;
			arr[c][r] = 1;
		}
		
		visited = new boolean[N + 1];
		sb = new StringBuilder();
		dfs(V);
		sb.append("\n");
		visited = new boolean[N + 1];
		bfs(V);
		System.out.println(sb);
	}

	private static void dfs(int V) {
		visited[V] = true;
		sb.append(V).append(" ");
		
		for(int i = 1; i <= N; i++) {
			if(arr[V][i] == 1 && !visited[i])
				dfs(i);
		}
	}
	
	private static void bfs(int V) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(V);
		visited[V] = true;
		
		while(!q.isEmpty()) {
			V = q.poll();
			sb.append(V).append(" ");
			
			for(int i = 1; i <= N; i++) {
				if(arr[V][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}