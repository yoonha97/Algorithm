import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for(int tc = 1; tc <= N; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sizeA = Integer.parseInt(st.nextToken());
			int[] arrA = new int[5];
			for(int i = 0; i < sizeA; i++){
				arrA[Integer.parseInt(st.nextToken())]++;
			}

			st = new StringTokenizer(br.readLine());
			int sizeB = Integer.parseInt(st.nextToken());
			int[] arrB = new int[5];
			for(int i = 0; i < sizeB; i++){
				arrB[Integer.parseInt(st.nextToken())]++;
			}
			
//			System.out.println(Arrays.toString(arrA));
//			System.out.println(Arrays.toString(arrB));
			
			String result = "";
			if(arrA[4] > arrB[4]) {
				result = "A";
			} else if(arrA[4] < arrB[4]) {
				result = "B";
			} else {
				if(arrA[3] > arrB[3]) {
					result = "A";
				} else if(arrA[3] < arrB[3]) {
					result = "B";
				} else {
					if(arrA[2] > arrB[2]) {
						result = "A";
					} else if(arrA[2] < arrB[2]) {
						result = "B";
					} else {
						if(arrA[1] > arrB[1]) {
							result = "A";
						} else if(arrA[1] < arrB[1]) {
							result = "B";
						} else {
							result = "D";
						}
					}
				}
			}
			System.out.println(result);
		}
	}
}