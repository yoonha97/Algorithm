import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1001];
        int N = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());
            int H = Integer.parseInt(st.nextToken());
            arr[L] = H;
        }
//        System.out.println(Arrays.toString(arr));
        
        int maxH = 0;
        int maxIdx = 0;
        for(int i = 0; i < 1001; i++) {
        	if(maxH < arr[i]) {
        		maxH = arr[i];
        		maxIdx = i;
        	}
        }
//        System.out.println(maxH + " " + maxIdx);
        
        int[] height = new int[1001];
        int currMax = 0; 
        for(int i = 0; i <= maxIdx; i++) {
        	currMax = Math.max(currMax, arr[i]);
        	height[i] = currMax;
        }
//        System.out.println(Arrays.toString(height));
        
        currMax = 0;
        for(int i = 1000; i > maxIdx; i--) {
        	currMax = Math.max(currMax, arr[i]);
        	height[i] = currMax;
        }
        
        int sum = 0;
        for(int i = 0; i < 1001; i++) {
        	sum += height[i];
        }
        
        System.out.println(sum);
    }
}