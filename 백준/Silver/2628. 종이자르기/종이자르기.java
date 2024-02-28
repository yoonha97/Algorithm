import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int col = Integer.parseInt(st.nextToken());
		int row = Integer.parseInt(st.nextToken());
		int[] R = new int[row + 1];
		int[] C = new int[col + 1];
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int where = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if(where == 0) {
				R[num] = 1;
			} else {
				C[num] = 1;
			}
			R[0] = 1; R[row] = 1;
			C[0] = 1; C[col] = 1;
		}
		
		int maxRow = 0;
		int maxCol = 0;
		int temp = 0;
		
		for(int i = 0; i < R.length; i++) {
			temp++;				 
			if(R[i] == 1) {
				if(maxRow < temp) {
					maxRow = temp;
				}
				temp = 0;
			}
		}
		
		temp = 0;
		for(int i = 0; i < C.length; i++) {
			temp++;				
			if(C[i] == 1) {
				if(maxCol < temp) {
					maxCol = temp;
				}
				temp = 0;
			}
		}
		
		System.out.println(maxRow * maxCol);
	}
}