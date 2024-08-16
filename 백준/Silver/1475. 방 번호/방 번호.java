import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		int[] cards = new int[10];
		int max = 0;

		for(int i = 0; i < N.length(); i++) {
			int num = Integer.parseInt(String.valueOf(N.charAt(i)));

			if(num == 9) {
				cards[6]++;
			} else {
				cards[num]++;
			}
		}

		if(cards[6] % 2 == 1) {
			cards[6] = cards[6] / 2 + 1;
		} else {
			cards[6] = cards[6] / 2;
		}

		for(int i = 0; i < cards.length; i++) {
			max = Math.max(max, cards[i]);
		}
		
		System.out.println(max);
	}
}