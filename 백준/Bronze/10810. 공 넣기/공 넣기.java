import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int repeat = sc.nextInt();
		
		int basket [] = new int[num];
		
		
		for(int k = 0; k < repeat; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int M = sc.nextInt();
			
			for(i = i - 1; i < j; i++) {
				basket[i] = M;
			}
		}
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%d ", basket[i]);
		}	
	}
}