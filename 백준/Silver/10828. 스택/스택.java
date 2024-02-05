import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		
		for(int t = 0; t < T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.equals("push")) {
				stack.push(Integer.parseInt(st.nextToken()));
			}
			if(str.equals("top")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");	
				} else {
					sb.append(stack.peek()).append("\n");
				}
			}
			if(str.equals("size")) {
				sb.append(stack.size()).append("\n");
			}
			if(str.equals("empty")) {
				if(stack.isEmpty()) {
					sb.append(1).append("\n");
				} else {
					sb.append(0).append("\n");
				}
			}
			if(str.equals("pop")) {
				if(stack.isEmpty()) {
					sb.append(-1).append("\n");
				} else {
					sb.append(stack.pop()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}