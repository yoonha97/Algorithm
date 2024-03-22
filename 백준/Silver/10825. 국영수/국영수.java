import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[][] arr = new String[N][4];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken();
			arr[i][1] = st.nextToken();
			arr[i][2] = st.nextToken();
			arr[i][3] = st.nextToken();
		}

//		System.out.println(Arrays.deepToString(arr));
		
		Arrays.sort(arr, new Comparator<String[]>() {

			@Override
			public int compare(String[] o1, String[] o2) {
				if(o2[1].equals(o1[1])) {
					if(o2[2].equals(o1[2])) {
						if(o2[3].equals(o1[3])) {
							return o1[0].compareTo(o2[0]);
						} else {
							return Integer.parseInt(o2[3]) - Integer.parseInt(o1[3]);							
						}
					} else {
						return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);						
					}
				} else {
					return Integer.parseInt(o2[1]) - Integer.parseInt(o1[1]);					
				}
			}
		});
		
		for(int i = 0; i < N; i++) {
			System.out.println(arr[i][0]);
		}
	}
}