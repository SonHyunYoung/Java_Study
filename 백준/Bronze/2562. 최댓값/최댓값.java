import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] input = new int[9];
		
		for(int i = 0; i < 9; i++) {
			
			input[i] = sc.nextInt();

		}
		
		int max = input[0], index = 1;
		
		for(int i = 0; i < 9; i++) {
			if(input[i] > max) {
				max = input[i];
				index = i + 1;
			}
		}
		
		System.out.println(max);
		System.out.print(index);
			
	}
}