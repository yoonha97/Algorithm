import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		int start = 0;
		
		for(int i = 0; i < N; i++) {
			int value = sc.nextInt();
			
			if(value > start) {
				for(int j = start + 1; j <= value; j++) {
					st.push(j);
					sb.append("+").append("\n");
				}
				start = value;
			} else if(st.peek() != value) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");
		}
		
		System.out.println(sb);
	}
}