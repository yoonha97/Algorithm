import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] numbers;
    static boolean[] visited;
    static Set<String> result;
    static List<Integer> output;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        numbers = new int[N];
        visited = new boolean[N];
        result = new LinkedHashSet<>();
        output = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numbers);

        backtrack(0);

        StringBuilder sb = new StringBuilder();
        for (String str : result) {
            sb.append(str).append("\n");
        }
        System.out.print(sb);
    }

    static void backtrack(int depth) {
        if (depth == M) {
            StringBuilder sb = new StringBuilder();
            for (int num : output) {
                sb.append(num).append(" ");
            }
            result.add(sb.toString().trim());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                output.add(numbers[i]);
                backtrack(depth + 1);
                visited[i] = false;
                output.remove(output.size() - 1);
            }
        }
    }
}