import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N]; // 0 or 1
		int[] val = new int[N];
		Queue<Integer> queue = new LinkedList<>(); // 값 저장
		
		StringTokenizer st1 = new StringTokenizer(br.readLine()); // 0 1 1 0
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(st1.nextToken());
		}

		
	
		StringTokenizer st2 = new StringTokenizer(br.readLine()); // 1 2 3 4
		for(int i=0; i<N; i++) {
			val[i] =  Integer.parseInt(st2.nextToken());
		}
		
		int qCount = 0;
		int sCount = 0;
		
		for(int i = N-1; i >=0; i--) {
			if(arr[i] == 0) {
				queue.offer(val[i]);
				qCount++;
			} else {
				sCount++;
			}
		}
		
		if (qCount == 0) {
			br.readLine();
			String str = br.readLine();
			System.out.println(str);
			return;
		}
		
		int M = Integer.parseInt(br.readLine());
		st1 = new StringTokenizer(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < M; i++) {
			int C = Integer.parseInt(st1.nextToken());
			sb.append(queue.poll()).append(' ');
			queue.offer(C);
		}
		System.out.println(sb.toString());
	}
}