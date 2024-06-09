import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[6];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < 6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());
		int P = Integer.parseInt(st.nextToken());
		
		int Tcnt = 0;
		int Pcnt = 0;
		int OneP = 0;
		
		for(int i = 0; i < 6; i++) {
			int cnt = arr[i] / T;
			if(arr[i] % T != 0) {
				cnt++;
			}
			Tcnt += cnt;
		}
		
		Pcnt = N / P;
		OneP = N % P;
		
		System.out.println(Tcnt);
		System.out.println(Pcnt + " " + OneP);
	}
}