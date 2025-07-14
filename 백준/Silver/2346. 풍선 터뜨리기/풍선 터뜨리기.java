import java.io.*;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

   public class Main  {
	  static class Balloon{
		  int index;
		  int move;
		  
		  Balloon(int index, int no){
			  this.index = index;
			  this.move = no;
		  }
	  }
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        Deque<Balloon> dq = new ArrayDeque<>();
        
        bw.write("1 ");
        
        int no [] = new int [N];
        
        for(int i = 0; i < N; i++) {
        	no[i] = Integer.parseInt(st.nextToken());
        }
       
              
        for(int i = 1; i < N; i++) {
        	dq.add(new Balloon(i + 1, no[i]));
        }
        
        int move = no[0];
        
        while(!dq.isEmpty()) {
        	
        	if(move > 0) {
        		for(int i = 1; i < move; i++) {
        			dq.add(dq.poll());
        		}
        		
        		Balloon next = dq.poll();
        		move = next.move;
        		bw.write(next.index + " ");
        	}
        	else {
        		for(int i = 1; i < -move; i++) {
        			dq.addFirst(dq.pollLast());
        		}
        		
        		Balloon next = dq.pollLast();
        		move = next.move;
        		bw.write(next.index + " ");
        	}
        }
       
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
