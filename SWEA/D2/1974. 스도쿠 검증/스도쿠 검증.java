import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for(int tc = 1; tc <= T; tc++) {
			int[][] arr = new int[9][9];
			for(int r = 0; r < 9; r++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int c = 0; c < 9; c++) {
					arr[r][c] = Integer.parseInt(st.nextToken());
				}
			}
			
			int answer = 1;
			for(int r = 0; r < 9; r++) {
				boolean[] check = new boolean[10];
				for(int c = 0; c < 9; c++) {
					int num = arr[r][c];
					if(check[num]) {
						answer = 0;
						break;						
					} else {
						check[num] = true;
					}
				}
			}
			
			for(int c = 0; c < 9; c++) {
				boolean[] check = new boolean[10];
				for(int r = 0; r < 9; r++) {
					int num = arr[r][c];
					if(check[num]) {
						answer = 0;
						break;
					} else {
						check[num] = true;
					}
				}
			}
			
			for(int r = 0; r < 9; r += 3) {
				for(int c = 0; c < 9; c += 3) {
					boolean[] check = new boolean[10];
					for(int i = r; i < r + 3; i++) {
						for(int j = c; j < c + 3; j++) {							
							int num = arr[i][j]; 
							if(check[num]) {
								answer = 0;
								break;
							} else {
								check[num] = true;
							}
						}
					}
				}
			}
			System.out.println("#" + tc + " " + answer);
		}
	}
}