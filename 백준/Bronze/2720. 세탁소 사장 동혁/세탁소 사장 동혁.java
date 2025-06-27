import java.io.*;

	public class Main  {
		
		public static void Calc_c(int c) {
			
			int [] chain = new int[4];
			
			chain[0] = c / 25;
			c -= chain[0] * 25;
			
			chain[1] = c / 10;
			c -= chain[1] * 10;
			
			chain[2] = c / 5;
			c -= chain[2] * 5;
			
			chain[3] = c / 1;
		
			
			for(int i = 0; i < 4; i++) {
				System.out.printf("%d ", chain[i]);
				if(i == 3) {
					System.out.println();
				}
			}
		}
		
		public static void main(String [] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int t = Integer.parseInt(br.readLine());
			
			for(int i = 0; i < t; i++) {
				int c = Integer.parseInt(br.readLine());
				
				Calc_c(c);
			}
		}
	}