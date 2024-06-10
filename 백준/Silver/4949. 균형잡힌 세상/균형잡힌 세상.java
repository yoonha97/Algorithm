import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String str = br.readLine();
			
			if(str.equals(".")) {
				break;
			}
			
			sb.append(check(str)).append("\n");
		}
		
		System.out.println(sb);
	}

	private static String check(String str) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			if(c == '(' || c == '[') {
				stack.push(c);
			} else if(c == ')') {
				if(stack.isEmpty() || stack.peek() != '(') {
					return "no";
				} else {
					stack.pop();
				}
			} else if(c == ']') {
				if(stack.isEmpty() || stack.peek() != '[') {
					return "no";
				} else {
					stack.pop();
				}
			}
		}
		if(stack.isEmpty()) {
			return "yes";
		} else {
			return "no";
		}
	}
}