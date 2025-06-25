	import java.util.Scanner;

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			for(int i = 0; i < num; i++) {
				String str = sc.next();
				
				int last = str.length() - 1;
				
				System.out.printf("%c%c", str.charAt(0), str.charAt(last));
				
				if(i != num - 1) {
					System.out.print("\n");
				}
			}
		}
	}