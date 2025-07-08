import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
     
        HashMap<Integer, Integer> cnt = new HashMap<>();

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        
        int [] num = new int [N];
        
        for(int i = 0; i < N; i++) {
        	num[i] = Integer.parseInt(st1.nextToken());
        }
        
        for(int i = 0; i < N; i++) {
        	
        	if(cnt.containsKey(num[i])) {
        		int count = cnt.get(num[i]) + 1;
        		
        		cnt.put(num[i], count);
        	}
        	
        	else {
        		cnt.put(num[i], 1);
        	}
        }
        
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < M; i++) {
        	int key = Integer.parseInt(st2.nextToken());
        	
        	if(cnt.containsKey(key)) {
        		bw.write(cnt.get(key) + " ");
        	}
        	else {
        		bw.write("0 ");
        	}
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
