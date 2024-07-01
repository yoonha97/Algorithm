import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] fruits = new int[N];
		int[] counting = new int[10];
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			fruits[i] = Integer.parseInt(st.nextToken());
		}

		int left = 0;
		int right = 0;
		int kind = 0;
		int max = 0;

		while (right < N) {
			if (counting[fruits[right]] == 0) {
				kind++;
			} // 해당 과일 첫 등장이면 종++
			counting[fruits[right]]++; // 해당 과일 개수++
			right++; // 오른쪽 포인터 이동

			while (kind > 2) { // 종류가 2가지 초과면
				counting[fruits[left]]--; // 왼쪽 포인터 과일--
				if (counting[fruits[left]] == 0) { // 해당 과일이 완전히 빠지면
					kind--; // 종류--
				}
				left++; // 왼쪽 포인터 이동
			}
			max = Math.max(max, right - left);
		}
		System.out.println(max);
	}
}