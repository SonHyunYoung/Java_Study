import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int row = sc.nextInt();
			int col = sc.nextInt();
			
			int [][] a = new int [row][col];
			int [][] b = new int [row][col];
			int [][] sum = new int [row][col];
			
			//a 입력
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			
			//b 입력
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					b[i][j] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					sum[i][j] = a[i][j] + b[i][j];
				}
			}
			
			for(int i = 0; i < row; i++) {
				for(int j = 0; j < col; j++) {
					System.out.printf("%d ", sum[i][j]);
				}
				
				if(i != row - 1) {
					System.out.print("\n");
				}
			}
		}
	}