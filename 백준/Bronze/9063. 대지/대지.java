import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
        int [][] coordinate = new int[N][2];
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
        		for(int j = 0; j < 2; j++) {
        			coordinate[i][j] = Integer.parseInt(st.nextToken());
        		}
        	}
    	
    	int max_x = coordinate[0][0], min_x = coordinate[0][0];
    	int max_y = coordinate[0][1], min_y = coordinate[0][1];
    	
    	for(int i = 0; i < N; i++) {
    		if(max_x < coordinate[i][0]) {
    			max_x = coordinate[i][0];
    		}
    		
    		if(min_x > coordinate[i][0]) {
    			min_x = coordinate[i][0];
    		}
        }
    	
    	for(int i = 0; i < N; i++) {
    		if(max_y < coordinate[i][1]) {
    			max_y = coordinate[i][1];
    		}
    		
    		if(min_y > coordinate[i][1]) {
    			min_y = coordinate[i][1];
    		}
    	}
    	
    	int s = (max_x - min_x) * (max_y - min_y);
    	
    	if(N < 2) {
    		s = 0;
    	}
    	
    	bw.write(String.valueOf(s));
    	bw.flush();
    	
    	bw.close();
    	br.close(); 	
    	 
   }	
}