import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int[] scores = new int[N + 1];
		int[] sum = new int[N + 1];

		for (int i = 1; i < N + 1; i++) {
			scores[i] = sc.nextInt();
		}

		sum[1] = scores[1];
		if (N >= 2)
			sum[2] = scores[1] + scores[2];
		if (N >= 3)
			sum[3] = Math.max(scores[1], scores[2]) + scores[3];

		for (int i = 4; i <= N; i++) {
			sum[i] = Math.max(sum[i - 3] + scores[i - 1], sum[i - 2]) + scores[i];
		}

		System.out.println(sum[N]);
	}
}