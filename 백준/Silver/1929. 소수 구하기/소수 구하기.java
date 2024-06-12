import java.util.Scanner;

public class Main {
	static boolean prime[];
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		prime = new boolean[N + 1];
		primeCheck();
		
		StringBuilder sb = new StringBuilder();
		for(int i = M; i <= N; i++) {
			if(!prime[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	private static void primeCheck() { // true = 소수아님, false = 소수
		prime[0] = prime[1] = true;
		
		for(int i = 2; i <= Math.sqrt(prime.length); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j < prime.length; j += i) {
				prime[j] = true;
			}
		}
	}
}