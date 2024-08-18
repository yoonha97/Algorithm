import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		String str2 = br.readLine();
		int[] cnt1 = new int[26];
		int[] cnt2 = new int[26];
		int cnt = 0;
		
		for(int i = 0; i < str1.length(); i++){
            cnt1[str1.charAt(i) - 'a']++;
        }
       
        for(int i = 0; i < str2.length(); i++){
            cnt2[str2.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i < 26; i++){
            cnt += Math.abs(cnt1[i] - cnt2[i]); 
        }
        
        System.out.println(cnt);
	}
}