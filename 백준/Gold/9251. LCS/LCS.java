import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word1 = br.readLine();
		String word2 = br.readLine();
		int len1 = word1.length();
		int len2 = word2.length();
		int[][] arr = new int[len1 + 1][len2 + 1];
		int max = 0;
		
		for(int i = 1; i <= len1; i++) {
			for(int j = 1; j <= len2; j++) {
				if(word1.charAt(i - 1) == word2.charAt(j - 1)) {
					arr[i][j] = arr[i - 1][j - 1] + 1;
					max = Math.max(max, arr[i][j]);
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}
		
		System.out.println(max);
	}
}