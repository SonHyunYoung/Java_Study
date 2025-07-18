import java.io.*;
import java.util.StringTokenizer;

public class Main{
	static int [] arr;
	static boolean [] visit;
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void dfs(int n, int m, int depth) throws IOException{
		if(depth == m) {
			for(int val : arr) {
				bw.write(val + " ");
			}
			bw.newLine();
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(!visit[i]) {
				visit[i] = true;
				arr[depth] = i + 1;
				dfs(n, m, depth + 1);
				visit[i] = false;
			}
		}
		
	}
	
	public static void main(String [] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		
		dfs(n, m, 0);
		
		br.close();
		bw.close();
	}
}