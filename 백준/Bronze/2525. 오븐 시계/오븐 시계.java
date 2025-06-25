import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //시간
		int m = sc.nextInt(); //분
		int c = sc.nextInt(); //요리하는데 필요한 시간
		
		h += c / 60;
		m += c % 60;

		if(m >= 60) {
			m -= 60;
			h++;
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.printf("%d %d", h, m);
		
	}
}