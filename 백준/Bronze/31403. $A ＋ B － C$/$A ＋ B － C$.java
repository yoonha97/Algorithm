import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		String str = "";
		str += A;
		str += B;
		int X = Integer.parseInt(str);
		
		System.out.println(A + B - C);
		System.out.println(X - C);
	}
}