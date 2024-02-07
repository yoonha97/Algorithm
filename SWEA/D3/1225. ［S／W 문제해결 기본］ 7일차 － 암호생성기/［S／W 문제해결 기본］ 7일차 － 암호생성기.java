import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		
		int T = 10;
		for(int t = 1; t <= T; t++) {
			br.readLine(); // 테케 번호
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i = 0; i < 8; i++) {
				queue.add(Integer.parseInt(st.nextToken())); // 큐에 숫자 저장
			}
			
//		System.out.println(queue);
			
			int num = 0; // 감소시킬 값
			while(queue.peek() != 0) { // 0이 나오기 전까지
				int n = queue.poll(); // 꺼내서
				num = (num++ % 5) + 1;
				n -= num; // 빼고
				
				if(n <= 0) {
					queue.add(0);
					break;
				}
				queue.add(n); // 저장
			}
			
//			System.out.println(queue);
//			queue.clear();
			
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < 8; i++) {
				sb.append(queue.poll()).append(" ");
			}
			
			System.out.printf("#" + t + " " + sb + "\n");
			
		}
	}
}