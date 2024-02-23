import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[1001][1001];
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N; i++) {
			int r, c, nr, nc = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
			nr = Integer.parseInt(st.nextToken());
			nc = Integer.parseInt(st.nextToken());
			
			for(int R = r; R <= r + nr - 1; R++) {
				for(int C = c; C <= c + nc - 1; C++) {
					arr[R][C] = i;
				}
			}
		}
		
		int count = 0;
		for(int i = 1; i <= N; i++) {
			count = 0;
			for(int r = 0; r < arr.length; r++) {
				for(int c = 0; c < arr.length; c++) {
					if(arr[r][c] == i) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
}