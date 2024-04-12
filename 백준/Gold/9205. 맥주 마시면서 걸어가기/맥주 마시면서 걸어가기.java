import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static int n;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int tc = 0; tc < T; tc++) {
			n = Integer.parseInt(br.readLine());
			int[][] store = new int[n + 2][2]; // x, y 좌표 순서대로 받는 배열
			
			for(int i = 0; i < n + 2; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				store[i][0] = Integer.parseInt(st.nextToken());
				store[i][1] = Integer.parseInt(st.nextToken());
			}
			
			ArrayList<ArrayList<Integer>> canGo = new ArrayList<>();
			for(int i = 0; i < n + 2; i++) {
				canGo.add(new ArrayList<>());
			}
			
			for(int i = 0; i < n + 2; i++) {
				for(int j = 0; j < n + 2; j++) {
					if(Math.abs(store[i][0] - store[j][0]) + Math.abs(store[i][1] - store[j][1]) <= 1000 && i != j) {
						canGo.get(i).add(j);
					}
				}
			}
//			System.out.println(canGo);
			
			boolean[] visited = new boolean[n + 2];
			Queue<Integer> q = new LinkedList<>();
			q.offer(0);
			
			boolean happy = false;
			while(!q.isEmpty() && !happy) {
				int now = q.poll();
				
				if(!visited[now]) {
					visited[now] = true;
					
					for(int i : canGo.get(now)) {
						if(i == n + 1) {
							happy = true;
							break;
						} else if(!visited[i]) {							
							q.offer(i);
						}
					}
				}
			}
			
			if(happy) System.out.println("happy");
			else System.out.println("sad");
		}
	}
}
