import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;

		if (N < 100) {
			answer = N;
		} else {
			int count = 0;
			for (int i = 100; i <= N; i++) {
				int current = i;
				int hundreds = current / 100;
				current -= hundreds * 100;
				int tens = current / 10;
				current -= tens * 10;
				int ones = current % 10;
				if (hundreds - tens == tens - ones) {
					count++;
				}
			}
			answer = 99 + count;
		}
		System.out.println(answer);
	}
}