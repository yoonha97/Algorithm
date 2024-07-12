import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());

			Queue<Integer> q = new LinkedList<>();
			boolean[] visited = new boolean[10000];
			String[] command = new String[10000];

			q.offer(A);
			visited[A] = true;
			command[A] = "";

			while(!q.isEmpty()){
				int now = q.poll();

				if(now == B){
					System.out.println(command[now]);
					break;
				}

				int D = (2 * now) % 10000;
				if(!visited[D]){
					q.offer(D);
					visited[D] = true;
					command[D] = command[now] + "D";
				}

				int S = now == 0 ? 9999 : now - 1;
				if(!visited[S]){
					q.offer(S);
					visited[S] = true;
					command[S] = command[now] + "S";
				}

				int L = (now % 1000) * 10 + (now / 1000);
				if(!visited[L]){
					q.offer(L);
					visited[L] = true;
					command[L] = command[now] + "L";
				}

				int R = (now % 10) * 1000 + (now / 10);
				if(!visited[R]){
					q.offer(R);
					visited[R] = true;
					command[R] = command[now] + "R";
				}
			}
		}
	}
}