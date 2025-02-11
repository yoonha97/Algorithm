import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int result = 0;
		
		for(int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int value = 0;
			
			if(Character.isDigit(ch)) {
				value = ch - '0';
			} else {
				value = ch - 'A' + 10;
			}
			
			result = result * 16 + value;
		}
		
		System.out.println(result);
	}
}