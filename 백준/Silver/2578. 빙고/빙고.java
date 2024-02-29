import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int[][] arr;
	static int count;
	static int bingo;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		arr = new int[5][5];
		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

//		System.out.println(Arrays.deepToString(arr));

		for (int i = 0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				int num = Integer.parseInt(st.nextToken());
				count++;
				for (int r = 0; r < 5; r++) {
					for (int c = 0; c < 5; c++) {
						if (arr[r][c] == num) {
							arr[r][c] = 0;
						}
					}
				}
				bingo = 0;
				rowSum(arr);
				colSum(arr);
				diaSum(arr);
				
				if (bingo >= 3) {
					System.out.println(count);
					return;
				}
			}

		}
	}

	public static void rowSum(int[][] arr) {
		for (int i = 0; i < 5; i++) {
			int num = 0;
			for (int j = 0; j < 5; j++) {
				num += arr[i][j];
			}
			if (num == 0) {
				bingo++;
			}
		}
	}

	public static void colSum(int[][] arr) {
		for (int j = 0; j < 5; j++) {
			int num = 0;
			for (int i = 0; i < 5; i++) {
				num += arr[i][j];
			}
			if (num == 0) {
				bingo++;
			}
		}
	}

	public static void diaSum(int[][] arr) {
		int num1 = 0;
		for (int i = 0; i < 5; i++) {
			num1 += arr[i][i];
		}
		if (num1 == 0) {
			bingo++;
		}
		
		int num2 = 0;
		for (int i = 0; i < 5; i++) {
			num2 += arr[i][4 - i];
		}
		if (num2 == 0) {
			bingo++;
		}
	}
}