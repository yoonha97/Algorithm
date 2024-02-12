import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int[] arr = new int[26];
		int max = 0;
		char ch = '?';
		
		for(int i = 0; i < str.length(); i++) {
			 if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				 arr[str.charAt(i) - 'A']++;
			 } else {
				 arr[str.charAt(i) - 'a']++;
			 }
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if(arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}