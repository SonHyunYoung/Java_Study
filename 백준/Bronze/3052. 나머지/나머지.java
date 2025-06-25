import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int remainder [] = new int[42];
		int cnt = 0;
		
		for(int i = 0; i < 10; i++) {
			int mod = sc.nextInt();
			
			remainder[mod % 42]++;
		}
		
		for(int i = 0; i < 42; i++) {
			
			if(remainder[i] != 0) {
				cnt++;
			}
		
		}
		
		System.out.print(cnt);
		
	}
}