import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int N = Integer.parseInt(br.readLine());
        
        int [] num = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < num.length; i++) {
        	num[i] = Integer.parseInt(st.nextToken());
        }
        
        Stack<Integer> stack = new Stack<>();
        
        int seqno = 1;
        for(int i = 0; i < num.length; i++) {
        	if(num[i] == seqno) {
        		seqno++;
        		
        		while(!stack.empty()) {
        			if(stack.peek() == seqno) {
        				stack.pop();
        				seqno++;
        			}
        			else {
        				break;
        			}
        		}
        	}
        	
        	else {
        		stack.push(num[i]);
        	}
        }
        
        if(stack.empty()) {
        	bw.write("Nice");
        	bw.flush();
        }
        else {
        	bw.write("Sad");
        	bw.flush();
        }
            
        bw.close();
        br.close();
        
        }
   }	
