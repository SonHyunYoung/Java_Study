import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashMap<String, String> name = new HashMap<>();
        HashMap<String, String> num = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
        	String poketmon = br.readLine();
        	
        	name.put(poketmon, String.valueOf(i + 1));
        	num.put(String.valueOf(i + 1), poketmon);
        }
        
        for(int i = 0; i < M; i++) {
        	String question = br.readLine();
        	
        	if(name.containsKey(question)) {
        		bw.write(name.get(question));
        		bw.newLine();
        	}
        	else if(num.containsKey(question)) {
        		bw.write(num.get(question));
        		bw.newLine();
        	}
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
