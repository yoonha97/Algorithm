import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
	static boolean[][] table;
	static int w;
	static int h;
	static int cnt;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		w = Integer.parseInt(str[0]);
		h = Integer.parseInt(str[1]);
		int n = Integer.parseInt(str[2]);
		table = new boolean[w][h];
		int[][] arr = new int[w][h];

		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {

				table[i][j] = true;

			}
		}
		
		for (int i = 0; i < n; i++) {
			str = br.readLine().split(" ");
			int x1 = Integer.parseInt(str[0]);
			int y1 = Integer.parseInt(str[1]);
			int x2 = Integer.parseInt(str[2]);
			int y2 = Integer.parseInt(str[3]);
			
			
			for (int j = w-y2; j < w-y1; j++) {
				for (int k = x1; k < x2; k++) {
					table[j][k] = false;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < w; i++) {
			for (int j = 0; j < h; j++) {
				if (table[i][j]) {
					move(i, j);
					list.add(cnt);
					cnt = 0;
					
				}
			}
			
			
		}
		System.out.println(list.size());
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		

	}

	static void move(int i, int j) {
		Queue<Integer[]> queue = new LinkedList<>();
		queue.add(new Integer[] { i, j });
		
		while (!queue.isEmpty()) {
			Integer[] current = queue.poll();
			int r = current[0];
			int c = current[1];

			if (!(0 <= r && r < w && 0 <= c && c < h) || !table[r][c]) {
				continue;
			}
			cnt++;
			table[r][c] = false;
			queue.add(new Integer[] { r + 1, c  });
			queue.add(new Integer[] { r - 1, c  });
			queue.add(new Integer[] { r , c - 1 });
			queue.add(new Integer[] { r , c + 1 });

		}
	}
}