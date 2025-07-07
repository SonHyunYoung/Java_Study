import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int [] card = new int [N];
        
        for(int i = 0; i < N; i++) {
        	card[i] = Integer.parseInt(st.nextToken());
        }
        
        HashMap<Integer, Integer> h = new HashMap<>();
        
        for(int i = 0; i < N; i++) {
        	h.put(card[i], 1);
        }
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        int [] num = new int[M];
        
        for(int i = 0; i < M; i++) {
        	num[i] = Integer.parseInt(st2.nextToken());
        }
        
        for(int i = 0; i < M; i++) {
        	if(h.containsKey(num[i])) {
        		bw.write(h.get(num[i]) + " ");
        	}
        	else {
        		bw.write('0' + " ");
        	}
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
