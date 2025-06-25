import java.util.Scanner;	
import java.util.StringTokenizer;

	public class Main {
		
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			double total = 0, rate = 0, grade_sum = 0;
			
			
			for(int i = 0; i < 20; i++) {
				StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
				
				String subject = st.nextToken();
				double grade = Double.parseDouble(st.nextToken());
				String credit = st.nextToken();
				
				if(!(credit.equals("P"))) {
					grade_sum += grade;
				}
				
				switch(credit) {
				case "A+":
					total += 4.5 * grade;
					break;
				case "A0":
					total += 4.0 * grade;
					break;
				case "B+":
					total += 3.5 * grade;
					break;
				case "B0":
					total += 3.0 * grade;
					break;
				case "C+":
					total += 2.5 * grade;
					break;
				case "C0":
					total += 2.0 * grade;
					break;
				case "D+":
					total += 1.5 * grade;
					break;
				case "D0":
					total += 1.0 * grade;
					break;
				case "F":
					total += 0.0 * grade;
					break;
				}
				
			}
			
			System.out.print(total / grade_sum);
	}
}
		