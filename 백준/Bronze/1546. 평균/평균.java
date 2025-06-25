	import java.util.Scanner;

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			double [] score = new double[num];
			
			for(int i = 0; i < num; i++) {
				score[i] = sc.nextDouble();
			}
			
			double max = score[0];
			
			for(int i = 1; i < num; i++) {
				if(max < score[i]) {
					max = score[i];
				}
			}
			
			double sum = 0;
			
			for(int i = 0; i < num; i++) {
				score[i] = (score[i] / max) * 100;
				sum += score[i];
				
			}
			
			double averge = sum / num;
			
			System.out.print(averge);
			
		}
	}