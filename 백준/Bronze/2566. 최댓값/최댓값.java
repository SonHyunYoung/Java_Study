import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int [][] a = new int [9][9];
			
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			int max = -1, row = 0, col = 0;
			
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					if(max < a[i][j]) {
						max = a[i][j];
						row = i + 1;
						col = j + 1;
					}
				}
			}
			
			System.out.println(max);
			System.out.printf("%d %d", row, col);
			
		}
	}