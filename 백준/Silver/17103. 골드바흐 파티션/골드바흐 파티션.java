import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        boolean [] prime = new boolean [1000001];
        
        prime[0] = prime[1] = true;
        
        for(int i = 0; i <= 1000000; i++) {
        	if(!prime[i]) {
        		for(int j = 2; i * j <= 1000000; j++) {
        			prime[i * j] = true;
        		} 
        	}
        }
        
        int t = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < t; i++) {
        	int n = Integer.parseInt(br.readLine());
        	
        	int cnt = 0;
        	
        	for(int j = 2; j <= n / 2; j++) {
        		if(!prime[j]) {
        			if(!prime[n - j]) {
        				cnt++;
        			}
        		}
        	}
        	
        	bw.write(cnt + "");
        	bw.newLine();
        	bw.flush();
        }
   
        bw.close();
        br.close();
        
        }
   }	
