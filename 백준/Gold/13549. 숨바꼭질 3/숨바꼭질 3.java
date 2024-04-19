import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[k+2];
		if(n<k) {
			arr[n]=0;
			for(int i=n;i>=1;i--) {
				arr[i]=n-i;
			}
			
			arr[n+1]=1;
			if(n==1) {
				arr[n+1]=0;
			}
			for(int i=n+2;i<=k;i++) {
				if(i%2==0) {
					arr[i]=Math.min(arr[i-1]+1, arr[i/2]);
				} else {
					arr[i]=Math.min(arr[i/2+1]+1, arr[i-1]+1);
				}
			}
			System.out.println(arr[k]);
		} else {
			System.out.println(n-k);
		}
		
	}
}