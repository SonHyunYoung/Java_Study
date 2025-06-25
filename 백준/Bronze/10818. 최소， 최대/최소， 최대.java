import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int [] input = new int[num];
		
		for(int i = 0; i < num; i++) {
			
			input[i] = sc.nextInt();
			
		}
		
		int min = input[0], max = input[0];
		
		for(int i = 0; i < num; i++) {
			
			if(input[i] < min) {
				min = input[i];
			}
			
			if(input[i] > max) {
				max = input[i];
			}
		}
		
		System.out.printf("%d %d", min, max);
			
	}
}