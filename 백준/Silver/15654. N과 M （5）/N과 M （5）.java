import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static int[] numbers;
    static int[] selected;
    static boolean[] used;
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        numbers = new int[N];
        selected = new int[M];
        used = new boolean[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers);
        
        backtrack(0);
    }
    
    public static void backtrack(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(' ');
            }
            System.out.println(sb);
            return;
        }
        
        for (int i = 0; i < N; i++) {
            if (!used[i]) {
                selected[depth] = numbers[i];
                used[i] = true;
                backtrack(depth + 1);
                used[i] = false;
            }
        }
    }
}