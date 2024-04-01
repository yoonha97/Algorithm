import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int N;
	static int[][] arr;
	static int answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N + 1][N + 1];
		
		for(int r = 1; r < N + 1; r++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int c = 1; c < N + 1; c++) {
				arr[r][c] = Integer.parseInt(st.nextToken());
			}
		}
				
		answer = 0;
		dfs(1, 2, 0);
		System.out.println(answer);
	}
	
	static void dfs(int r, int c, int dir) { // dir (0 : 가로 1 : 세로 2 : 대각선)
		if(r == N && c == N) {
			answer++;
			return;
		}
		
		switch(dir) {
		case 0: // 가로
			if(c + 1 <= N && arr[r][c + 1] == 0)
				dfs(r, c + 1, 0);
			break;
			
		case 1: // 세로
			if(r + 1 <= N && arr[r + 1][c] == 0)
				dfs(r + 1, c, 1);
			break;
			
		case 2: // 대각선
			if(c + 1 <= N && arr[r][c + 1] == 0)
				dfs(r, c + 1, 0);
			
			if(r + 1 <= N && arr[r + 1][c] == 0)
				dfs(r + 1, c, 1);
			break;
		}
		
		if(r + 1 <= N && c + 1 <= N && arr[r + 1][c] == 0 && arr[r][c + 1] == 0 && arr[r + 1][c + 1] == 0)
			dfs(r + 1, c + 1, 2);
	}
}