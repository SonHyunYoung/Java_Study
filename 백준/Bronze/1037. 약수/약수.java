import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;
	
public class Main{
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int [] yaksu = new int [N];
		
		for(int i = 0; i < N; i++) {
			yaksu[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(yaksu);
		
		
		int n = yaksu[0] * yaksu[N - 1];
		
		bw.write(n + "");
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}