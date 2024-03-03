import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	static int M;
	static int K;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			PriorityQueue<Integer> queue = new PriorityQueue<>();
			
			st = new StringTokenizer(br.readLine());
			for(int n = 0; n < N; n++) {
				queue.offer(Integer.parseInt(st.nextToken()));
			}
			sb.append("#").append(tc).append(" ").append(sell(queue));
			System.out.println(sb);
		}
	}
	
	static String sell(Queue<Integer> queue) {
		int sold = 0;
		while(!queue.isEmpty()) {
			if(queue.poll() / M * K - sold++ <= 0) {
				return "Impossible";
			}
		}
		return "Possible";
	}
}