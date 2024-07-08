import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		int p = a;
		int q = 2 * b * c;
		int r = a * (c * c - a * a + b * b);

		int d = q * q - 4 * p * r;
		if (d < 0) {
			System.out.println(-1);
			return;
		}

		double x = (-q + Math.sqrt(d)) / (2 * p);

		if (x < 0) {
			System.out.println(-1);
			return;
		}

		System.out.println((int) (x + 1e-5));

	}
}