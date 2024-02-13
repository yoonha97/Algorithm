import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int repeat = N / 4;
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < repeat; i++) {
			sb.append("long").append(" ");
		}
		sb.append("int");
		System.out.println(sb);
	}
}