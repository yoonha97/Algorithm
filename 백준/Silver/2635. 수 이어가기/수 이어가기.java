import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int firstNum = sc.nextInt();
		int secondNum = firstNum / 2;
		int maxCount = 0;
		int maxSecondNum = 0;
		
		while(secondNum <= firstNum) {
			ArrayList<Integer> arr = new ArrayList<>();
			arr.add(firstNum);
			arr.add(secondNum);
			int count = 2;
			
			for(int i = 2; ; i++) {
				int result = arr.get(i-2) - arr.get(i-1);
				if(result < 0) {
					break;
				}
				arr.add(result);
				count++;
			}
			
			if(maxCount < count) {
				maxCount = count;
				maxSecondNum = secondNum;
			}
			secondNum++;
		}
		
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(firstNum);
		arr.add(maxSecondNum);
		int count = 2;
		
		for(int i = 2; ; i++) {
			int result = arr.get(i-2) - arr.get(i-1);
			if(result < 0) {
				break;
			}
			arr.add(result);
		}
		
		System.out.println(maxCount);
//		System.out.println(arr);
		
		for(int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
	}
}