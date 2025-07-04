import java.io.*;


   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        int N2 = N;
        
        int cnt = 0;
        
        
        for(int i = 0; i < N; i++) {
        	for(int j = 0; j < N; j++) {
        		if((i * 5) + (j * 3) == N) {
        			if(cnt != 0) {
        				cnt = (int) Math.min(cnt, i + j);
        			}
        			else {
        				cnt = i + j;
            			break;
        			}
        		}
        	}
        }
       
        if(cnt == 0) {
        	cnt = -1;
        }
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
