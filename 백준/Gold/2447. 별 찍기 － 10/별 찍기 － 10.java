import java.io.*;

public class Main{
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void print_star(int x, int y, int n) throws IOException {
		//TODO 별을 출력할지 말지 올바르게 저장.
		
		if(x / n % 3 == 1 && y / n % 3 == 1) {
			bw.write(' ');
		}
		
		else {
			if(n == 1) {
				bw.write('*');
			}
			else {
				print_star(x, y, n / 3);
			}
		}
	}
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); //n 입력
		
		//함수 호출
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				print_star(i, j, n);
			}
			bw.newLine(); //줄바꿈
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}