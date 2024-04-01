import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append(" ");
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int V = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			
			int[][] adj = new int[V + 1][V + 1];
			int[] degree = new int[V + 1];
			
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < E; i++) {
				int A = Integer.parseInt(st.nextToken());
				int B = Integer.parseInt(st.nextToken());
				
				adj[A][B] = 1;
				degree[B]++;
			}
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i = 1; i < V + 1; i++) {
				if(degree[i] == 0) {
					q.offer(i);
				}
			}
			
			while(!q.isEmpty()) {
				int curr = q.poll();
				sb.append(curr).append(" ");
				
				for(int i = 1; i < V + 1; i++) {
					if(adj[curr][i] == 1) {
						degree[i]--;
						
						if(degree[i] == 0) {
							q.offer(i);
						}
					}
				}
			}
			System.out.println(sb);
		}
	}
}