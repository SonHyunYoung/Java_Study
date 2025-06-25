import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int student_num [] = new int[30];
		
		for(int i = 0; i < 28; i++) {
			int check = sc.nextInt();
			
			student_num[check - 1] = 1;
		}
		
		int index = 1;
		
		for(int i = 0; i < 30; i++) {
			if(student_num[i] != 1) {
				index = i + 1;
				System.out.println(index);
			}
		}
	}
}