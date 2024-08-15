import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int a = sc.nextInt();

			if(a == 0) break;

			for(int i = 1; i <= a; i++) {
				for(int j = 0; j < i; j++){
					System.out.print('*');
				}
				System.out.println();
			}
		}
	}
}