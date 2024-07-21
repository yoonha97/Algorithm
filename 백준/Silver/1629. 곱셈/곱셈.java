import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        
        long res = modPow(A, B, C);
        System.out.println(res);
    }
    
    public static long modPow(long base, long exp, long mod) {
        if (exp == 0) {
            return 1;
        }
        
        long half = modPow(base, exp / 2, mod);
        half = (half * half) % mod;
        
        if (exp % 2 != 0) {
            half = (half * base) % mod;
        }
        
        return half;
    }
}