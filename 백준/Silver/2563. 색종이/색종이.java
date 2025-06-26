import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int [][] paper =  new int [100][100];
			
			int num = sc.nextInt();
			
			for(int i = 0; i < num; i++) {
				int col = sc.nextInt();
				int row = sc.nextInt();
				
				row--;
				col--;
				
				for(int j = row; j < row + 10; j++) {
					for(int k = col; k < col + 10; k++) {
						paper[j][k] = 1;
					}
				}
			}

			int cnt = 0;
			
			for(int i = 0; i < 100; i++) {
				for(int j = 0; j < 100; j++) {
					if(paper[i][j] == 1) {
						cnt++;
					}
				}
			}
			
			System.out.print(cnt);
			
		}
	}