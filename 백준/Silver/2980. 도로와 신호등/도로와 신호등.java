import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		Queue<Integer> DQ = new LinkedList<>();
		Queue<Integer> RQ = new LinkedList<>();
		Queue<Integer> GQ = new LinkedList<>();
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			DQ.offer(Integer.parseInt(st.nextToken()));
			RQ.offer(Integer.parseInt(st.nextToken()));
			GQ.offer(Integer.parseInt(st.nextToken()));
		}
		
		int t = 0;
		int pos = 0;
		
		for(int i = 0; i < N; i++) {
			int D = DQ.poll();
			int R = RQ.poll();
			int G = GQ.poll();
			t += D - pos;
			pos = D;
			
			if(t < R) {
				t += R - t;
			} else if((t - R) % (G + R) >= G) {
				t += (G + R) - ((t - R) % (G + R));
			}
		}
		
		if(pos < L) {
			t += L - pos;
		}
		
		System.out.println(t);
	}
}