import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		// 상 좌 하 우
		int[] dr = { 0, -1, 0, 1 };
		int[] dc = { 1, 0, -1, 0 };
		
		int dir = 0;
		
		for(int tc = 0; tc < T; tc++) {
			int maxX = 0;
			int maxY = 0;
			int minX = 0;
			int minY = 0;
			int r = 0;
			int c = 0;
			
			String str = br.readLine();
			for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) == 'F') {
					r = r + dr[dir];
					c = c + dc[dir];
				} else if(str.charAt(i) == 'B') {
					r = r - dr[dir];
					c = c - dc[dir];
				} else if(str.charAt(i) == 'L') {
					dir = (dir+1) % 4;
				} else if(str.charAt(i) == 'R') {
					dir = (dir+3) % 4;
				}
//				System.out.println(r + " " + c);
				maxX = Math.max(maxX, r);
				maxY = Math.max(maxY, c);
				minX = Math.min(minX, r);
				minY = Math.min(minY, c);
			}
//			System.out.println(maxX + " " + minX + " " + maxY + " " + minY);
			System.out.println((maxX - minX) * (maxY - minY));
		}
	}
}