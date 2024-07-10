import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[] map = new int[101];
		boolean[] visited = new boolean[101];
		Arrays.fill(map, -1);

		for(int i = 0; i < N; i++){
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[start] = end;
		}

		for(int i = 0; i < M; i++){
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			map[start] = end;
		}

		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[]{1, 0});
		visited[1] = true;

		while(!q.isEmpty()){
			int[] temp = q.poll();
			int pos = temp[0];
			int cnt = temp[1];

			if(pos == 100){
				System.out.println(cnt);
				return;
			}

			for(int i = 1; i <= 6; i++){
				int next = pos + i;

				if(next > 100){
					continue;
				}

				if(map[next] != -1){
					next = map[next];
				}

				if(!visited[next]){
					visited[next] = true;
					q.offer(new int[]{next, cnt + 1});
				}
			}
		}
	}
}