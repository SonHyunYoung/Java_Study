import java.io.*;

public class Main{
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void hanoi (int n, int start, int mid, int to) throws IOException{
		if(n == 1) {
			bw.write(start + " " + to);
			bw.newLine();
			
			return;
		}
		
		hanoi(n - 1, start, to, mid);
		
		bw.write(start + " " + to);
		bw.newLine();
		
		hanoi(n - 1, mid, start, to);
	}
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //하노이 개수 입력
		
		
		int k = (int) Math.pow(2, n) - 1;
		
		bw.write(k + "");
		bw.newLine();
		
		hanoi(n, 1, 2, 3);
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}