import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 1; t <= T; t++) {
			Queue<String> queue = new LinkedList<>();
			Queue<String> queue2 = new LinkedList<>();
			
			int len = Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < (len + 1) / 2; i++) { // 홀
				queue.add(st.nextToken());
			}
			for(int i = 0; i < len / 2; i++) { // 짝
				queue2.add(st.nextToken());
			}
			
//			System.out.println(queue);
//			System.out.println(queue2);
			
			StringBuilder sb = new StringBuilder();
			
			sb.append("#").append(t).append(" ");
			
			for(int i = 0; i < len / 2; i++) {
				sb.append(queue.poll()).append(" ").append(queue2.poll()).append(" ");
			}
			
			if(len % 2 == 1) {
				sb.append(queue.poll());
			}
			
			System.out.println(sb.toString().trim());
		}
	}
}