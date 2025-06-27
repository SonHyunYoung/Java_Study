import java.io.*;

	public class Main  {
		
		public static void main(String [] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int n = Integer.parseInt(br.readLine());
			int a = 1;
			
			for(int i = 0; i < n; i++) {
				a *= 2;
				
				if(i == n - 1) {
					a+= 1;
				}
						
			}
			
			System.out.print((int) Math.pow(a, 2));
		}
	}