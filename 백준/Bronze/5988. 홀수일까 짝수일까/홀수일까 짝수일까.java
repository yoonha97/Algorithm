import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N =Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			BigInteger a = new BigInteger(br.readLine());
			if(a.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
				System.out.println("even");
			} else {
				System.out.println("odd");
			}
		}
	}
}