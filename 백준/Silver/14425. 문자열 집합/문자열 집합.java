import java.io.*;
import java.util.StringTokenizer;
import java.util.HashSet;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        String [] str = new String[N];
        
        for(int i = 0; i < N; i++) {
        	str[i] = br.readLine();
        }
        
        String [] str2 = new String[M];
        
        for(int i = 0; i < M; i++) {
        	str2[i] = br.readLine();
        }
        
        int cnt = 0;
        
        for(int i = 0; i < M; i++) {
        	for(int j = 0; j < N; j++) {
        		if(str2[i].equals(str[j])) {
        			cnt++;
        		}
        	}
        }
        
        bw.write(cnt + "");
        bw.flush();
        
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
