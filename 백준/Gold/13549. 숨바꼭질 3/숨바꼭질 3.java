import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[100001];
        Arrays.fill(arr, -1);

        // BFS를 이용하여 최소 시간을 구함
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        arr[n] = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == k) break;

            // 현재 위치에서 순간이동 하는 경우
            if (current * 2 <= 100000 && arr[current * 2] == -1) {
                arr[current * 2] = arr[current];
                queue.offer(current * 2);
            }
            // 현재 위치에서 -1 또는 +1 로 이동하는 경우
            for (int next : new int[]{current - 1, current + 1}) {
                if (next >= 0 && next <= 100000 && arr[next] == -1) {
                    arr[next] = arr[current] + 1;
                    queue.offer(next);
                }
            }
        }
        System.out.println(arr[k]);
    }
}