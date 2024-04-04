import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int money = sc.nextInt();
	
			int[] moneys = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
			int[] count = new int[8];
			
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(tc).append("\n");
			
			for(int i = 0; i < 8; i++) {
				count[i] = money / moneys[i];
				money = money % moneys[i];
				sb.append(count[i]).append(" ");
			}
			
			System.out.println(sb);
		}
	}
}