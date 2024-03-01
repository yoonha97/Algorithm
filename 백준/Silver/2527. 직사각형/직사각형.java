import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = 4;
		for(int tc = 0; tc < T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int p1 = Integer.parseInt(st.nextToken());
			int q1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int p2 = Integer.parseInt(st.nextToken());
			int q2 = Integer.parseInt(st.nextToken());
			//----------------------------------------------------
			int xlength2 = p2 - x2;
			int ylength2 = q2 - y2;
			
			int bigx = x1 - xlength2;
			int bigy = y1 - ylength2;
			int bigp = p1 + xlength2;
			int bigq = q1 + ylength2;
			
			if(x2 < bigx || p2 > bigp || y2 < bigy || q2 > bigq) {
				System.out.println('d');
			} else if((x2 == bigx || x2 == p1) && (y2 == bigy || q2 == bigq)) {
				System.out.println('c');
			} else if((x2 == bigx) || (y2 == bigy) || (p2 == bigp) || (q2 == bigq)) {
				System.out.println('b');
			} else {
				System.out.println('a');
			}
		}
	}
}