import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String N = sc.next();

		int num = Integer.parseInt(N);
		int[] digits = divideTensOnes(num);
				
		int answer = cycle(digits[0], digits[1], 1, num);
		System.out.println(answer);
	}
			
	private static int[] divideTensOnes(int num) {
		int tens, ones;
			if (num < 10) {
					tens = 0;
					ones = num;
			} else {
					tens = num / 10;
					ones = num % 10;
			}
			return new int[]{tens, ones};
	}
		
	private static int cycle(int tens, int ones, int count, int original) {
		int newTens = ones;
		int newOnes = (tens + ones) % 10;
		int newNum = newTens * 10 + newOnes;
		
		if(newNum == original){
			return count;
		} else {
			return cycle(newTens, newOnes, count + 1, original);
		}
	}
}