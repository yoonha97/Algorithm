import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		int[] arr = new int[8001];
		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int median = 10000;
		int mode = 10000;
		
		for(int i = 0; i < N; i++) {
			int value = sc.nextInt();
			sum += value;
			arr[value + 4000]++;
		
			if(max < value) {
				max = value;
			}
			if(min > value) {
				min = value;
			}
		}
		
		int count = 0;
		int mode_max = 0;
		boolean flag = false;	 
		
		for(int i = min + 4000; i <= max + 4000; i++) {
			if(arr[i] > 0) {
				
				/*
				 * <중앙값 찾기>
				 * 누적횟수가 전체 전체 길이의 절반에 못 미친다면 
				 */
				if(count < (N + 1) / 2) {
					count += arr[i];	// i값의 빈도수를 count 에 누적
					median = i - 4000;
				}
				
				/*
				 * <최빈값 찾기>
				 * 이전 최빈값보다 현재 값의 빈도수가 더 높을 경우 
				 */
				if(mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;	// 첫 등장이므로 true 로 변경 
				}
				// 이전 최빈값 최댓값과 동일한 경우면서 한 번만 중복되는 경우 
				else if(mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;					
				}
			}
		}
		
		System.out.println((int)Math.round((double)sum / N));
		System.out.println(median);
		System.out.println(mode);
		System.out.println(max - min);
	}
 
}