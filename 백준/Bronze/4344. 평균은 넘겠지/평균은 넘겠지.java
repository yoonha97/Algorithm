import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int C = Integer.parseInt(br.readLine());

		for(int i = 0; i < C; i++){
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int[] scores = new int[N];
			int total = 0;
			int overAverage = 0;

			for(int j = 0; j < N; j++){
				int score = Integer.parseInt(st.nextToken());
				scores[j] = score;
				total += score;
			}

			double average = (double) total / N;

			for (int j = 0; j < N; j++){
				if(scores[j] > average){
					overAverage++;
				}
			}

			double percentage = (double) overAverage / N * 100;
			System.out.printf("%.3f%%\n", percentage);
		}
	}
}