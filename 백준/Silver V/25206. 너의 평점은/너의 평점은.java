import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		double sum = 0.0; // 총 학점
		double point = 0.0; // 평점
		
		for(int i = 0; i < 20; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			st.nextToken();
			double credit = Double.parseDouble(st.nextToken());
			String grade = st.nextToken();
			
			if(grade.equals("A+")) {
				sum += credit;
				point += credit * 4.5;
			} else if(grade.equals("A0")) {
				sum += credit;
				point += credit * 4.0;
			}  else if(grade.equals("B+")) {
				sum += credit;
				point += credit * 3.5;
			}  else if(grade.equals("B0")) {
				sum += credit;
				point += credit * 3.0;
			}  else if(grade.equals("C+")) {
				sum += credit;
				point += credit * 2.5;
			}  else if(grade.equals("C0")) {
				sum += credit;
				point += credit * 2.0;
			}  else if(grade.equals("D+")) {
				sum += credit;
				point += credit * 1.5;
			}  else if(grade.equals("D0")) {
				sum += credit;
				point += credit * 1.0;
			}  else if(grade.equals("F")) {
				sum += credit;
				point += credit * 0.0;
			}
		}
		System.out.println(point / sum);
	}
}