import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m = m - 45;
		
		if(m < 0) {
			h = h - 1;
			m = 60 + m;
		}
		
		if(h == -1) {
			h = 23;
		}
		
		System.out.printf("%d %d",h, m);
	}
}