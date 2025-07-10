import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        int n = Integer.parseInt(br.readLine());
        
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i < n; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	int input = Integer.parseInt(st.nextToken());
        	
        	switch(input) {
        	case 1 :
        		s.push(Integer.parseInt(st.nextToken()));
        		break;
        	case 2:
        		if(s.empty()) {
        			bw.write("-1");
        			bw.newLine();
        			bw.flush();
        		}
        		else {
        			bw.write(s.pop() + "");
        			bw.newLine();
        			bw.flush();
        		}
        		
        		break;
        	case 3:
        		bw.write(s.size() + "");
        		bw.newLine();
        		bw.flush();
        		
        		break;
        	case 4:
        		if(s.empty()) {
        			bw.write("1");
        			bw.newLine();
        			bw.flush();
        		}
        		else {
        			bw.write("0");
        			bw.newLine();
        			bw.flush();
        		}
        		break;
        	case 5:
        		if(!s.empty()) {
        			bw.write(s.peek() + "");
        			bw.newLine();
        			bw.flush();
        		}
        		else {
        			bw.write("-1");
        			bw.newLine();
        			bw.flush();
        		}
        		break;
        	}
        }
   
        bw.close();
        br.close();
        
        }
   }	
