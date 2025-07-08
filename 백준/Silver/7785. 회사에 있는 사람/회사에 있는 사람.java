import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        
        HashSet<String> enter = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        	
        	String name = st1.nextToken();
        	
        	if(st1.nextToken().equals("enter")) {
        		enter.add(name);
        	}
        	else {
        		enter.remove(name);
        	}
        }
        
        ArrayList<String> temp = new ArrayList<>(enter); 
        temp.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < temp.size(); i++) {
        	bw.write(temp.get(i));
        	bw.newLine();
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
