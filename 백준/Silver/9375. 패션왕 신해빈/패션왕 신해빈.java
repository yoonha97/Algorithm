import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			HashMap<String, Integer> map = new HashMap<>();
			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				String type = st.nextToken();

				if (map.containsKey(type)) {
					map.put(type, map.get(type) + 1);
				} else {
					map.put(type, 1);
				}
			}
			
			int result = 1;
			
			for(int value : map.values()) {
				result *= (value + 1);
			}
			
			System.out.println(result - 1);
		}
	}
}