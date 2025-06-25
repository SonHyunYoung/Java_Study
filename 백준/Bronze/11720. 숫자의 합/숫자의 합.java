	import java.util.Scanner;

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			String str = sc.next();
			
			char [] number = new char[num];
			number = str.toCharArray();
			
			int sum = 0;
			
			for(int i = 0; i < num; i++) {
				sum += Integer.parseInt(String.valueOf(number[i]));
			}
			
			System.out.print(sum);
		}
	}