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
        	String str = br.readLine();
        	String [] input = str.split(" "); 
        	
        	switch(input[0]) {
        	case "push":
        		dq.offer(Integer.parseInt(input[1]));
        		break;
        		
        	case "pop":
        		int pop = (dq.isEmpty()) ? -1 : dq.poll();
        		
        		bw.write(pop + "");
        		bw.newLine();
        	
        		break;
        		
        	case "size":
        		bw.write(dq.size() + "");
        		bw.newLine();
        		
        		break;
        		
        	case "empty":
        		int empty = (dq.isEmpty()) ? 1 : 0;
        		
        		bw.write(empty + "");
        		bw.newLine();
        		
        		break;
        		
        	case "front":
        		int front = (dq.isEmpty()) ? -1 : dq.peek();
        		
        		bw.write(front + "");
        		bw.newLine();

        		break;
   
        	case "back":
        		int back = (dq.isEmpty()) ? -1 : dq.peekLast();
        		
        		bw.write(back + "");
        		bw.newLine();
        		
        		break;
      
        	}
        	
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
