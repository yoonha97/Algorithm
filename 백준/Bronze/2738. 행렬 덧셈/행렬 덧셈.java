import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[N][M];
        int[][] arrB = new int[N][M];
        int[][] arrSum = new int[N][M];

        // 행렬 A 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 B 입력
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // 행렬 덧셈
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arrSum[i][j] = arrA[i][j] + arrB[i][j];
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                bw.write(arrSum[i][j] + " ");
            }
            bw.newLine();  // 다음 행으로 넘어감
        }

        // 리소스 닫기
        br.close();
        bw.flush();
        bw.close();
    }
}