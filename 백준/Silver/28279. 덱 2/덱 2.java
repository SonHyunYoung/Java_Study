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
        	String input = br.readLine();
        	String [] str = input.split(" ");
        	
        	switch(str[0]) {
        	case "1" :
        		dq.offerFirst(Integer.parseInt(str[1]));
        		break;
        	case "2":
        		dq.offerLast(Integer.parseInt(str[1]));
        		break;
        	case "3":
        		if(dq.isEmpty()) {
        			bw.write("-1");
        			bw.newLine();
        		}
        		else {
        			bw.write(dq.pollFirst() + "");
        			bw.newLine();
        		}
        		
        		break;
        	case "4":
        		if(dq.isEmpty()) {
        			bw.write("-1");
        			bw.newLine();
        		}
        		else {
        			bw.write(dq.pollLast() + "");
        			bw.newLine();
        		}
        		
        		break;
        	case "5" :
        		bw.write(dq.size() + "");
        		bw.newLine();
        		
        		break;
        	case "6":
        		if(dq.isEmpty()) {
        			bw.write("1");
        			bw.newLine();
        		}
        		else {
        			bw.write("0");
        			bw.newLine();
        		}
        		
        		break;
        	case "7":
        		if(dq.isEmpty()) {
        			bw.write("-1");
        			bw.newLine();
        		}
        		else {
        			bw.write(dq.peekFirst() + "");
        			bw.newLine();
        		}
        		
        		break;
        	case "8":
        		if(dq.isEmpty()) {
        			bw.write("-1");
        			bw.newLine();
        		}
        		else {
        			bw.write(dq.peekLast() + "");
        			bw.newLine();
        		}
        		
        		break;
        	
        	}
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
