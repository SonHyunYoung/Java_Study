import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int repeat = sc.nextInt();
		
		int basket [] = new int[num];
		
		for(int i = 0; i < num; i++) {
			basket[i] = i + 1;
		}
		
		for(int k = 0; k < repeat; k++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int tmp;
			
			tmp = basket[i - 1];
			basket[i - 1] = basket[j - 1];
			basket[j - 1] = tmp;
		}
		
		for(int i = 0; i < num; i++) {
			System.out.printf("%d ", basket[i]);
		}
	}
}