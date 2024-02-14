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

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());
			Node[] nodes = new Node[N + 1];

			for (int i = 1; i <= N; i++) {
				nodes[i] = new Node();
			}

			for (int i = 1; i <= N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				if(st.countTokens() == 4) {
					st.nextToken();
					nodes[i].data = st.nextToken();
					nodes[i].left = nodes[Integer.parseInt(st.nextToken())];
					nodes[i].right = nodes[Integer.parseInt(st.nextToken())];
				} else if(st.countTokens() == 2) {
					st.nextToken();
					nodes[i].num = Integer.parseInt(st.nextToken());
				}
			}
			postorder(nodes[1]);
			System.out.println("#" + tc + " " + nodes[1].num);
		}
	}

	static void postorder(Node node) {
		if (node == null) {
			return;
		}
		postorder(node.left);
		postorder(node.right);
		
		if(node.left != null && node.right != null) {
			if(node.data.equals("+")) {
				node.num = node.left.num + node.right.num;
			} else if(node.data.equals("-")) {
				node.num = node.left.num - node.right.num;
			} else if(node.data.equals("*")) {
				node.num = node.left.num * node.right.num;
			} else if(node.data.equals("/")) {
				node.num = node.left.num / node.right.num;
			}
		}
	}
}