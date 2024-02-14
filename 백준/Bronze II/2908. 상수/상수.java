import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sbA = new StringBuilder(st.nextToken()).reverse();
		StringBuilder sbB = new StringBuilder(st.nextToken()).reverse();
		
		int RA = Integer.parseInt(sbA.toString());
		int RB = Integer.parseInt(sbB.toString());
		
		if(RA > RB) {
			System.out.println(RA);
		} else {
			System.out.println(RB);
		}	
	}
}