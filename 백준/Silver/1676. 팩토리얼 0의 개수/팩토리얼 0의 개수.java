import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 0;
        
        // 5의 배수마다 하나의 0이 추가되므로 5의 배수의 개수를 센다.
        for (int i = 5; i <= N; i *= 5) {
            cnt += N / i;
        }
        
        System.out.println(cnt);
    }
}