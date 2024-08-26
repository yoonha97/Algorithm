import java.util.Scanner;

public class Main {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = sc.nextInt();
		int[] count = new int[n];
		int max = -99999999;

		for(int i = 0; i < n; i++) {
			String a = sc.next();
			int c = 0;

			for(int j = 0; j < a.length() - 1; j++) {
				if(a.charAt(j) == '1' && a.charAt(j + 1) == '0') {
					c++;
				}
			}
			if(a.charAt(a.length() - 1) == '1') {
				c++;
			}

			count[i] = c;
			max = Math.max(max, count[i]);
		}
		int cnt = 0;
        
		for(int i = 0; i < n; i++) {
			if(count[i] == max) {
				cnt++;
			}
		}
		System.out.println(max + " " + cnt);
	}

}