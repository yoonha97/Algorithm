import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 1;
		int num = 1;
		
		if(N == 1) {
			count = 1;
		} else {
			while(num < N) {
				num += 6 * count;
				count++;
			}
		}
		System.out.println(count);
	}
}