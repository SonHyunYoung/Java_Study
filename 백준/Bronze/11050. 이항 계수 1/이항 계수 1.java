import java.io.*;
import java.util.StringTokenizer;
	
public class Main{
	public static int factorial(int n) {
		if(n == 0) {
			return 1;
		}
		else {
			return n * factorial(n - 1);
		}
	}
	
	public static int combination(int n, int r) {
		int mo = factorial(n);
		int ja = factorial(n - r) * factorial(r);
		 
		 return mo / ja; 
	}
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		bw.write(combination(N, K) + "");
		bw.flush();
		
		br.close();
		bw.close();
	}
}