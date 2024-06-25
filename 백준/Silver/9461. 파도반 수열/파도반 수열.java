import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		int max = 100;
		long[] arr = new long[100];

		arr[0] = 1;
		arr[1] = 1;
		arr[2] = 1;

		for (int i = 3; i < arr.length; i++) {
			arr[i] = arr[i - 3] + arr[i - 2];
		}

		for (int tc = 0; tc < T; tc++) {
			int num = sc.nextInt();
			System.out.println(arr[num - 1]);

		}
	}
}