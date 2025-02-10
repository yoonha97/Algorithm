import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, Integer> map = new HashMap<>();
		int T = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cow = Integer.parseInt(st.nextToken());
			int position = Integer.parseInt(st.nextToken());
			
			if(map.containsKey(cow)) {
				if(map.get(cow) != position) {
					cnt++;
				}
			}
			
			map.put(cow, position);
		}
		
		System.out.println(cnt);
	}
}