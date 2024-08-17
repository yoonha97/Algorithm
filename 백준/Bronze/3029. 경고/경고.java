import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        String[] s1 = str1.split(":");
        String[] s2 = str2.split(":");
        
        int time1 = Integer.parseInt(s1[0]) * 3600 + Integer.parseInt(s1[1]) * 60 + Integer.parseInt(s1[2]);
        int time2 = Integer.parseInt(s2[0]) * 3600 + Integer.parseInt(s2[1]) * 60 + Integer.parseInt(s2[2]);

        int diff = time2 - time1;
        
        if (diff <= 0) {
            diff += 24 * 3600;
        }

        int hours = diff / 3600;
        int minutes = (diff % 3600) / 60;
        int seconds = diff % 60;

        System.out.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}