import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Arrays;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        int [] coordinate = new int[N];
        int [] sort = new int[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < N; i++) {
        	coordinate[i] = sort[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(sort);
        
        HashMap<Integer, Integer> h = new HashMap<>();
        
        h.put(sort[0], 0);
        
        int rank = 1;
        
        for(int i = 1; i < N; i++) {
        	if(!h.containsKey(sort[i])) {
        		h.put(sort[i], rank);
        		rank++;
        	}
        	
        }
        
        for(int i = 0; i < N; i++) {
        	bw.write(h.get(coordinate[i]) + " ");
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
