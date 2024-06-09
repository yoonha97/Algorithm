import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	static int N, M;
	static LinkedList<int[]> q;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());

			q = new LinkedList<>();
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < N; i++) {
				q.offer(new int[] {i, Integer.parseInt(st.nextToken())});
			}

			System.out.println(Solution(M));
		}
	}

	private static int Solution(int m) {
		int cnt = 0;
		
		while(!q.isEmpty()) {
			int[] first = q.poll();
			boolean isMax = true;
			for(int i = 0; i < q.size(); i++) {
				if(first[1] < q.get(i)[1]) {
					q.offer(first);
					
					for(int j = 0; j < i; j++) {
						q.offer(q.poll());
					}
					
					isMax = false;
					break;
				}
			}
			
			if(isMax == false) {
				continue;
			}
			
			cnt++;
			
			if(first[0] == M) {
				break;
			}
		}
		
		return cnt;
	}
}