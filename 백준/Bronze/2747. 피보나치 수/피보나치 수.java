import java.util.Scanner;

public class Main {
	static int[] memo = new int[46];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = fibo(N);
		System.out.println(answer);
	}

	private static int fibo(int N) {
		if (N == 0) {
			return 0;
		}
		if (N == 1) {
			return 1;
		}
		if (memo[N] != 0)
			return memo[N];
		return memo[N] = fibo(N - 1) + fibo(N - 2);
	}
}