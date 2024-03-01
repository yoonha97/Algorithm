import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> dir = new ArrayList<>();
		ArrayList<Integer> len = new ArrayList<>();
		
		int K = Integer.parseInt(br.readLine());
		for(int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			dir.add(Integer.parseInt(st.nextToken()));
			len.add(Integer.parseInt(st.nextToken()));
		}
//		System.out.println(Arrays.toString(dir));
//		System.out.println(Arrays.toString(len));
		
		while(true) {
			if(dir.get(0) == dir.get(2) && dir.get(1) == dir.get(3)) {
				break;
			} else {
				int temp1 = dir.get(0);
				dir.remove(0);
				dir.add(temp1);
				
				int temp2 = len.get(0);
				len.remove(0);
				len.add(temp2);
			}
			
		}
		
		int field = (len.get(4) * len.get(5)) - (len.get(1) * len.get(2));
		int answer = field * K;
		System.out.println(answer);
	}
}