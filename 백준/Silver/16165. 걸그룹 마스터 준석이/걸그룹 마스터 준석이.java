import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		Map<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String group = br.readLine();
			int num = Integer.parseInt(br.readLine());
			List<String> list = new ArrayList<>();
			for (int j = 0; j < num; j++) {
				list.add(br.readLine());
			}
			map.put(group, list);
		}
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			String name = br.readLine();
			int member = Integer.parseInt(br.readLine());

			if (member == 1) {
				for (String group : map.keySet()) {
					if (map.get(group).contains(name)) {
						sb.append(group + "\n");
						break;
					}
				}
			} else {
				List<String> list = map.get(name);
				Collections.sort(list);
				for (String memberName : list) {
					sb.append(memberName + "\n");
				}
			}
		}

		System.out.println(sb);

	}

}