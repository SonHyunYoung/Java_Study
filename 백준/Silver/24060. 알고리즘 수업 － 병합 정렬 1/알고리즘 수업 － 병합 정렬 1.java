import java.io.*;
import java.util.StringTokenizer;

public class Main{
	static int [] A, tmp;
	static int k;
	static int result = -1;
	static int cnt = 0;
	
	public static void merge_sort(int [] A, int p, int r) {
		if(cnt > k) {
			return;
		}
		
		if(p < r) {
			int q = (p + r) / 2;
			merge_sort(A, p, q);
			merge_sort(A, q + 1, r);
			merge(A, p, q, r);
		}
	}
	
	public static void merge(int [] A, int p, int q, int r) {
		int i = p;
		int j = q + 1;
		int t = 0;
		
		while(i <= q && j <= r) {
			if(A[i] <= A[j]) {
				tmp[t++] = A[i++];
			}
			else {
				tmp[t++] = A[j++];
			}
		}
		while(i <= q) {
			tmp[t++] = A[i++];
		}
		while(j <= r) {
			tmp[t++] = A[j++];
		}
		
		i = p;
		t = 0;
		
		while(i <= r) {
			cnt++;
			if(cnt == k) {
				result = tmp[t];
			}
			A[i++] = tmp[t++];
		}
	}
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(), " ");
		
		A = new int[n];
		tmp = new int[n];
		
		for(int i = 0; i < n; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		
		merge_sort(A, 0, n - 1);
		
		bw.write(result + "");
		bw.flush();
		
		br.close();
		bw.close();
	}
}