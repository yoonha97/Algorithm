import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			Stack<Character> stack = new Stack<>();
			String result = "YES";
			String str = br.readLine();
			
			for(int i = 0; i < str.length(); i++) {		
				char c = str.charAt(i);
				
				if(c == '(') {
					stack.push(c);
				} else if(stack.isEmpty()) {
					result = "NO";
				} else {
					stack.pop();
				}
			}
			
			if(!stack.isEmpty()) {
				result = "NO";
			}
			
			System.out.println(result);
		}
	}
}