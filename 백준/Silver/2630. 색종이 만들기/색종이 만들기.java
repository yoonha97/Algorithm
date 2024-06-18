import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int white = 0;
	static int blue = 0;
	static int[][] board;	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		board = new int[N][N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		partition(0, 0, N);
		System.out.println(white);
		System.out.println(blue);
	}

	private static void partition(int row, int col, int N) {
		if(colorCheck(row, col, N)) {
			if(board[row][col] == 0) {
				white++;
			} else {
				blue++;
			}
			return;
		}
		
		int newN = N / 2;
		partition(row, col, newN);
		partition(row + newN, col, newN);
		partition(row, col + newN, newN);
		partition(row + newN, col + newN, newN);
	}

	private static boolean colorCheck(int row, int col, int N) {
		int color = board[row][col];
		
		for(int i = row; i < row + N; i++) {
			for(int j = col; j < col + N; j++) {
				if(board[i][j] != color) {
					return false;
				}
			}
		}
		return true;
	}
}