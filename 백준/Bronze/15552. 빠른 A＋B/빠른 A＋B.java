import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String [] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < num; i++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			
			
			bw.write((a + b) + "");
			
			if(i != num - 1) {
				bw.newLine();	
			}
			
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}