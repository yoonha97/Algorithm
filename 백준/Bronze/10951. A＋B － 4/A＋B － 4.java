import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			int sum = num1 + num2;
			System.out.println(sum);	
		}
		sc.close();
	}
}