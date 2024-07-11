import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 0; tc < T; tc++) {
			int K = Integer.parseInt(br.readLine());
			TreeMap<Integer, Integer> map = new TreeMap<>();

			for (int k = 0; k < K; k++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				char cmd = st.nextToken().charAt(0);
				int num = Integer.parseInt(st.nextToken());

				if (cmd == 'I') {
					map.put(num, map.getOrDefault(num, 0) + 1);
				} else {
					if (map.isEmpty())
						continue;

					int key = (num == 1) ? map.lastKey() : map.firstKey();
					if (map.get(key) == 1) {
						map.remove(key);
					} else {
						map.put(key, map.get(key) - 1);
					}
				}
			}

			if (map.isEmpty())
				System.out.println("EMPTY");
			else
				System.out.println(map.lastKey() + " " + map.firstKey());
		}
	}
}