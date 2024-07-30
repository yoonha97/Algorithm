import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		boolean[][] rel = new boolean[N + 1][N + 1];

		for(int i = 0; i < M; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			rel[a][b] = true;
			rel[b][a] = true;
		}

		int cnt = bfs(rel, N);
		System.out.println(cnt);
	}

	private static int bfs(boolean[][] rel, int N) {
		boolean[] visited = new boolean[N + 1];
		Queue<Integer> q = new LinkedList<>();
		q.offer(1);
		visited[1] = true;

		int count = 0;
		int depth = 0;
		while (!q.isEmpty() && depth < 2) {
      int size = q.size();
      for (int i = 0; i < size; i++) {
        int current = q.poll();
        for (int j = 1; j <= N; j++) {
          if (rel[current][j] && !visited[j]) {
            visited[j] = true;
            q.add(j);
            count++;
          }
        }
      }
    depth++;
    }   
    return count;
	}
}