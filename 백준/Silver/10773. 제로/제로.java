import java.io.*;
import java.util.Stack;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int k = Integer.parseInt(br.readLine());
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < k; i++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	if(n == 0) {
        		s.pop();
        	}
        	else {
        		s.push(n);
        	}
        }
        
        long sum = 0;
        for(int i : s) {
        	sum += i;
        }
        
        bw.write(sum + "");
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
