import java.io.*;
import java.util.StringTokenizer;
	
public class Main{
	static int [][] dp = new int[30][30];
	
	public static int combination(int n, int r) {
		if(n == r || r == 0) {
			return dp[n][r] = 1;
		}
		if(dp[n][r] > 0 ) {
			return dp[n][r];
		}
		
		return dp[n][r] = combination(n - 1, r - 1) + combination(n - 1, r);
	}
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			int tmp;
			if(n < r) {
				tmp = n;
				n = r;
				r = tmp;
			}
			
			bw.write(combination(n, r) + "");
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}