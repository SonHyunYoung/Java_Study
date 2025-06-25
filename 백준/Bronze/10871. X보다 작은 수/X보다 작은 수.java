import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int compare = sc.nextInt();
		
		int [] input = new int[num];
		
		for(int i = 0; i < num; i++) {
			input[i] = sc.nextInt();		
		}
		
		int cnt = 0;
		
		for(int i = 0; i < num; i++) {
			if(input[i] < compare) {
				System.out.printf("%d ", input[i]);
			}
		}
			
	}
}