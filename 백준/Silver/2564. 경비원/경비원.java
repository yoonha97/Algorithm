import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int X = Integer.parseInt(st.nextToken());
		int Y = Integer.parseInt(st.nextToken());
		int T = Integer.parseInt(br.readLine());
		int[] distance = new int[T];
		
		for(int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int dir = Integer.parseInt(st.nextToken());
			int len = Integer.parseInt(st.nextToken());
			
			switch(dir) {
			case 1 : // 북
				distance[tc] = len;
				break;
			case 2 : // 남
				distance[tc] = (2 * X + Y) - len;
				break;
			case 3 : // 서
				distance[tc] = (2 * X + 2 * Y) - len;
				break;
			case 4 : // 동
				distance[tc] = X + len;
				break;
			}
			
		}		
//		System.out.println(Arrays.toString(distance));
		
		int position = 0;
		st = new StringTokenizer(br.readLine());
		int dir = Integer.parseInt(st.nextToken());
		int len = Integer.parseInt(st.nextToken());
		switch(dir) {
		case 1 : // 북
			position = len;
			break;
		case 2 : // 남
			position = (2 * X + Y) - len;
			break;
		case 3 : // 서
			position = (2 * X + 2 * Y) - len;
			break;
		case 4 : // 동
			position = X + len;
			break;
		}
//		System.out.println(position);
		
		int sum = 0;
		for(int tc = 0; tc < T; tc++) {
			int dif = Math.abs(position - distance[tc]);
			int mindist = Math.min(dif, 2 * (X + Y) - dif);
			sum += mindist;
		}
		System.out.println(sum);
	}
}