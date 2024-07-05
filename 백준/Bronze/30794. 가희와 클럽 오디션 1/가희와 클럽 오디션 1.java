import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int level = Integer.parseInt(st.nextToken());
		String score = st.nextToken();
		int result = 0;

		if(score.equals("miss")){
			result = level * 0;
		} else if(score.equals("bad")){
			result = level * 200;
		} else if(score.equals("cool")){
			result = level * 400;
		} else if(score.equals("great")){
			result = level * 600;
		} else {
			result = level * 1000;
		}
		
		System.out.println(result);
	}
}