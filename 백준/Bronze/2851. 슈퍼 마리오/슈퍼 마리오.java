import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        int[] sum = new int[10];
        
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            nums[i] = num;
        }
        
        sum[0] = nums[0];
        for(int i = 1; i < 10; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        
//        System.out.println(Arrays.toString(sum));
        
        int dif = 100 - sum[0];
        int result = sum[0];
        for(int i = 1; i < 10; i++) {
        	int newdif = Math.abs(100 - sum[i]);
            if(newdif < dif) {
            	dif = newdif;
                result = sum[i];
            } else if(newdif == dif) {
                result = Math.max(result, sum[i]);
            }
        }
        System.out.println(result);
    }
}