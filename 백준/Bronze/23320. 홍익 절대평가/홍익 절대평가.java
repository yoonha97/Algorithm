import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] score = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++){
			score[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int abs = Integer.parseInt(st.nextToken()) * N / 100;
		int relScore = Integer.parseInt(st.nextToken());
		int rel = 0;

		for(int i = 0; i < N; i++){
			if(score[i] >= relScore){
				rel++;
			}
		}
		System.out.println(abs + " " + rel);
	}
}