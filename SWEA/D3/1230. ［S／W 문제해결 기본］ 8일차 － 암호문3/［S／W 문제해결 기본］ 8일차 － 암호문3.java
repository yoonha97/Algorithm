import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node {
	String data;
	Node link;
	
	Node(){}
	
	Node(String data){
		this.data = data;
	}
}

class SinglyLinkedList {
	Node head;
	int size;
	
	SinglyLinkedList(){
		head = new Node();
	}
	
	void addLast(String data) {
		Node newNode = new Node(data);
		Node curr = head;
		while(curr.link != null) {
			curr = curr.link;
		}
		curr.link = newNode;
		
		size++;
	}
	
	void add(int idx, String data) {
		if(idx < 0 || size < idx) {
			System.out.println("삽입할 수 없는 위치입니다");
			return;
		}
		
		Node curr = head;
		for(int i = 0; i < idx; i++) {
			curr = curr.link;
		}
		
		Node newNode = new Node(data);
		newNode.link = curr.link;
		curr.link = newNode;
		
		size++;
	}
	
	void printList(int tc) {
		Node curr = head.link;
		System.out.print("#" + tc + " ");
		int count = 0;
		while(curr != null && count < 10) {
			System.out.print(curr.data + " ");
			curr = curr.link;
			count++;
		}
		System.out.println();
	}
	
	void remove(int idx) {
		Node curr = head;
		for(int i = 0; i < idx; i++) {
			curr = curr.link;
		}
		curr.link = curr.link.link;
		
		size--;
	}
}
public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = 10;
		
		for(int tc = 1; tc <= T; tc++) {
			SinglyLinkedList list = new SinglyLinkedList(); 
			int length = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < length; i++) {
				list.addLast(st.nextToken());
			}
			
			int command = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			
			for(int i = 0; i < command; i++) {
				String Command = st.nextToken();
				
				if(Command.equals("I")) {					
					int idx = Integer.parseInt(st.nextToken());
					int repeat = Integer.parseInt(st.nextToken());
					for(int j = 0; j < repeat; j++) {
						list.add(idx, st.nextToken());
						idx++;
					}
				} else if(Command.equals("D")) {
					int idx = Integer.parseInt(st.nextToken());
					int repeat = Integer.parseInt(st.nextToken());
					for(int j = 0; j < repeat; j++) {
						list.remove(idx);
					}
				} else if(Command.equals("A")) {
					int repeat = Integer.parseInt(st.nextToken());
					for(int j = 0; j < repeat; j++) {
						list.addLast(st.nextToken());
					}
				}
			}
			list.printList(tc);
		}
	}
}