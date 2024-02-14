import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	int num;
	String data;
	Node left;
	Node right;

	Node() {
	}
}

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());
			Node[] nodes = new Node[N + 1];
			
			for(int i = 1; i <= N; i++) {
				nodes[i] = new Node();
			}
			
			for (int i = 1; i <= N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				nodes[i].num = Integer.parseInt(st.nextToken());
				nodes[i].data = st.nextToken();
				if (st.hasMoreTokens())
					nodes[i].left = nodes[Integer.parseInt(st.nextToken())];
				if (st.hasMoreTokens())
					nodes[i].right = nodes[Integer.parseInt(st.nextToken())];
			}
			System.out.print("#" + tc + " ");
			inorder(nodes[1]);
			System.out.println();
		}
	}

	static void inorder(Node node) {
		if (node == null) {
			return;
		}
		inorder(node.left);
		System.out.print(node.data);
		inorder(node.right);
	}
}