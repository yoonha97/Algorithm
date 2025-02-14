import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static int[] memo = new int[1000001];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		Arrays.fill(memo, -1);
		memo[0] = 0;
		memo[1] = 1;

		if (N == 0) {
			System.out.println(0);
			System.out.println(0);
			return;
		}

		int absN = Math.abs(N);
		int fib = fibo(absN);

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

	private static int fibo(int n) {
		if (memo[n] != -1)
			return memo[n];

		return memo[n] = (fibo(n - 1) + fibo(n - 2)) % 1000000000;
	}
}