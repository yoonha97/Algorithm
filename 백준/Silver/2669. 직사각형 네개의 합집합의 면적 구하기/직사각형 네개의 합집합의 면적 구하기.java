import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[][] arr = new int[101][101];
		
		for(int tc = 0; tc < 4; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int leftx = Integer.parseInt(st.nextToken());
			int lefty = Integer.parseInt(st.nextToken());
			int rightx = Integer.parseInt(st.nextToken());
			int righty = Integer.parseInt(st.nextToken());
			
			for(int x = leftx; x < rightx; x++) {
				for(int y = lefty; y < righty; y++) {
					arr[x][y] = 1;
				}
			}			
		}
		
		int answer = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				answer += arr[i][j];
			}
		}
		System.out.println(answer);
	}
}