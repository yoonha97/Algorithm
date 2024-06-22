import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		HashMap<Integer, String> map1 = new HashMap<>();
		HashMap<String, Integer> map2 = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			String name = br.readLine();
			map1.put(i, name);
			map2.put(name, i);
		}
		
		for(int i = 0; i < M; i++) {
			String quiz = br.readLine();
			if(quiz.charAt(0) >= 49 && quiz.charAt(0) <= 57) {
				sb.append(map1.get(Integer.parseInt(quiz))).append("\n");
			} else {
				sb.append(map2.get(quiz)).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}