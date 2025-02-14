import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if (N == 0) {
			System.out.println(0);
			System.out.println(0);
			return;
		}

		int absN = Math.abs(N);
		int[] dp = new int[absN + 1];
		dp[0] = 0;
		dp[1] = 1;

		for (int i = 2; i <= absN; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2]) % 1000000000;
		}

		int fib = dp[absN];

		if (N < 0 && (N % 2 == 0)) {
			fib = -fib;
		}

		if (fib > 0) {
			System.out.println(1);
		} else if (fib < 0) {
			System.out.println(-1);
		} else {
			System.out.println(0);
		}

		System.out.println(Math.abs(fib));
	}
}