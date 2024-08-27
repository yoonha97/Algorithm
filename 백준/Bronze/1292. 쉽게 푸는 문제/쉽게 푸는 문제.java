import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int[] sequence = new int[1001];
        int index = 1;
        int number = 1;

        while (index <= 1000) {
            for (int i = 0; i < number && index <= 1000; i++) {
                sequence[index] = number;
                index++;
            }
            number++;
        }

        int sum = 0;
        for (int i = A; i <= B; i++) {
            sum += sequence[i];
        }

        System.out.println(sum);
    }
}