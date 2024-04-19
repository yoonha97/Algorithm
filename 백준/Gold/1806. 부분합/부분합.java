import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}

		Queue<Integer> queue = new LinkedList<>();
		int min = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			queue.add(arr[i]);
			sum += arr[i];
			
			while(sum>=k) {
				min = Math.min(min, queue.size());
				sum-=queue.poll();
			}
		}
		if(min==Integer.MAX_VALUE) {
			System.out.println(0);
		} else {
			System.out.println(min);
		}
	}
}