import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[][] arr = new String[5][15];
		
		for(int r = 0; r < 5; r++) {
			String str = br.readLine();
			for(int c = 0; c < str.length(); c++) {
				arr[r][c] = String.valueOf(str.charAt(c));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int c = 0; c < 15; c++) {
			for(int r = 0; r < 5; r++) {
				if(arr[r][c] != null) {
					sb.append(arr[r][c]);
				}
			}
		}

		System.out.println(sb);
		
	}
}