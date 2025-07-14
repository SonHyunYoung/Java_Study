import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	Deque<Integer> dq = new ArrayDeque<>();
    	
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int [] A = new int[N];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = Integer.parseInt(st.nextToken());
        }
        
        StringTokenizer B = new StringTokenizer(br.readLine(), " ");
       
        for(int i = 0; i < N; i++) {
        	int num = Integer.parseInt(B.nextToken());
        	
        	if(A[i] == 0) {
        		dq.addLast(num);
        	}
        }
        
        int M = Integer.parseInt(br.readLine());
        
        StringTokenizer st3 = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < M; i++) {
        	dq.addFirst(Integer.parseInt(st3.nextToken()));
        	bw.write(dq.pollLast() + " ");
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        
      }
   }	
