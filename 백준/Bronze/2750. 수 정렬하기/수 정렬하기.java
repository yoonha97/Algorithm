import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for(int i = 0; i < N; i++){
			pq.offer(sc.nextInt());
		}

		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}

		sc.close();
	}
}