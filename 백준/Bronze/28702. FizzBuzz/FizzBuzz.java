import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str1 = scanner.nextLine();
		String str2 = scanner.nextLine();
		String str3 = scanner.nextLine();
		int str4 = 0;
		
		if(isInt(str1)) {
			str4 = Integer.parseInt(str1) + 3;
		} else if(isInt(str2)) {
			str4 = Integer.parseInt(str2) + 2;
		} else {
			str4 = Integer.parseInt(str3) + 1;
		}
		
		String ans = doFizzBuzz(str4);
		
		System.out.println(ans);
	}	

	public static boolean isInt(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

	private static String doFizzBuzz(int str4) {
		if((str4 % 3 == 0) && (str4 % 5 == 0)) {
			return "FizzBuzz";
		} else if((str4 % 3 == 0)) {
			return "Fizz";
		} else if((str4 % 5 == 0)) {
			return "Buzz";
		} else {
			return String.valueOf(str4);
		}
	}
}