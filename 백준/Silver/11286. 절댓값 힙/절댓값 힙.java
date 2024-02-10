import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>(Collections.reverseOrder());
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x > 0) {
				pq1.offer(x);
			} else if(x < 0) {
				pq2.offer(x);
			} else {
				if(pq1.isEmpty() && pq2.isEmpty()) {
					sb.append(0).append("\n");
				} else if(pq1.isEmpty() && !pq2.isEmpty()) {
					sb.append(pq2.poll()).append("\n");
				} else if(!pq1.isEmpty() && pq2.isEmpty()) {
					sb.append(pq1.poll()).append("\n");
				} else {
					int a = pq1.peek();
					int b = pq2.peek();
					
					if((a + b) >= 0) {
						sb.append(pq2.poll()).append("\n");
					} else {
						sb.append(pq1.poll()).append("\n");
					}
				}
			}
		}
		System.out.println(sb);		
	}
}