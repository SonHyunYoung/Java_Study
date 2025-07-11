import java.io.*;
import java.util.Deque;
import java.util.LinkedList;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        
        for(int i = 0; i < N; i++) {
        	dq.addLast(i + 1);
        }
   
        while(dq.size() != 1) {
        	dq.poll();
        	int new_first = dq.poll();
        	
        	dq.addLast(new_first);
        }
        
        bw.write(dq.poll() + "");
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
