import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static final int INF = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[][] rel = new int[N + 1][N + 1];
		
		for(int i = 0; i < N + 1; i++) {
			for(int j = 0; j < N + 1; j++) {
				rel[i][j] = INF;
				
				if(i == j) {
					rel[i][j] = 0;
				}
			}
		}
		
		for(int info = 0; info < M; info++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			rel[a][b] = 1;
			rel[b][a] = 1;
		}
		
		for(int i = 1; i < N + 1; i++) {
			BFS(rel, N, i);
		}
		
		int res = INF;
		int idx = -1;
		
		for(int i = 1; i < N + 1; i++) {
			int total = 0;
			for(int j = 1; j < N + 1; j++) {
				total += rel[i][j];
			}
			if(res > total) {
				res = total;
				idx = i;
			}
		}
		
		System.out.println(idx);
	}

	private static void BFS(int[][] rel, int N, int start) {
		Queue<Integer> q = new LinkedList<>();
		boolean[] visited = new boolean[N + 1];
		q.offer(start);
		visited[start] = true;

		while(!q.isEmpty()) {
			int cur = q.poll();
			for(int i = 1; i < N + 1; i++) {
				if(rel[cur][i] == 1 && !visited[i]) {
					q.offer(i);
					visited[i] = true;
					rel[start][i] = rel[start][cur] + 1;
					
				}
			}
		}
	}
}