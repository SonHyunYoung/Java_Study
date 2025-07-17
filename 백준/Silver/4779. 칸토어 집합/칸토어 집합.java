import java.io.*;

public class Main{
	public static void devide(int start, int len, char [] arr) {
		if(len == 1) {
			return;
		}
		
		len /= 3;
		
		for(int i = start + len; i < start + 2 * len; i++) {
			arr[i] = ' ';
		}
		
		devide(start, len, arr);
		devide(start + 2 * len, len, arr);
	}
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = "";
		
		while((s = br.readLine()) != null) {
			int n = Integer.parseInt(String.valueOf(s));
			int len = (int) Math.pow(3, n);
			
			char [] arr = new char [len];
			
			for(int i = 0; i < len; i++) {
				arr[i] = '-';
			}

			devide(0, len, arr);			
			
			bw.write(new String (arr));
			bw.newLine();
			bw.flush();
			
        }
		
		br.close();
		bw.close();
	}
}