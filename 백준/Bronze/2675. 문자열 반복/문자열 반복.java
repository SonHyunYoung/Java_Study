	import java.util.Scanner;
	
	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int test_Case = sc.nextInt();
			
			for(int i = 0; i < test_Case; i++) {
				int repeat = sc.nextInt();
				String str = sc.next();
				
				char [] char_arr = str.toCharArray();
				
				for(int j = 0; j < str.length(); j++) {
					for(int k = 0; k < repeat; k++) {
						System.out.print(char_arr[j]);
					}
				}
				System.out.print("\n");
			}
		}
	}