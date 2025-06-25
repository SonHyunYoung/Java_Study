import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(89 < score) {
			System.out.print('A');
		}
		else if(79 < score) {
			System.out.print('B');
		}
		else if(69 < score) {
			System.out.print('C');
		}
		else if(59 < score) {
			System.out.print('D');
		}
		else {
			System.out.print('F');
		}
	}
}