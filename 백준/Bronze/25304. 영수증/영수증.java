import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int num = sc.nextInt();
		
		int cost_sum = 0;
		
		for(int i = 0; i < num; i++) {
			int cost = sc.nextInt();
			int cnt = sc.nextInt();
			
			cost_sum += cost * cnt;
		}
		
		if(cost_sum == total) {
			System.out.print("Yes");
		}
		else{
			System.out.print("No");
		}
		
	}
}