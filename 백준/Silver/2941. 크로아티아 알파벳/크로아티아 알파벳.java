import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String input = sc.next();
			String [] alphabet = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
					
			
			for(int i = 0; i < alphabet.length; i++) {
				if(input.contains(alphabet[i])) {
					input = input.replace(alphabet[i], "O");
				}
			}
			
			System.out.print(input.length());
		}
	}