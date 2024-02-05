import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			if(str.equals("front")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");	
				} else {
					sb.append(queue.peek()).append("\n");
				}
			}
			if(str.equals("back")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");	
				} else {
					sb.append(((LinkedList<Integer>) queue).getLast()).append("\n");
				}
			}
			if(str.equals("size")) {
				sb.append(queue.size()).append("\n");
			}
			if(str.equals("empty")) {
				if(queue.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
			if(str.equals("pop")) {
				if(queue.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(queue.poll()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}