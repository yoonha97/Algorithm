import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arrW = new int[10];
		int[] arrK = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arrW[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arrW);
		int sumW = arrW[7] + arrW[8] + arrW[9];
		
		for(int j = 0; j < 10; j++) {
			arrK[j] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arrK);
		
		int sumK = arrK[7] + arrK[8] + arrK[9];
		
		System.out.printf("%d %d", sumW, sumK);
	}
}