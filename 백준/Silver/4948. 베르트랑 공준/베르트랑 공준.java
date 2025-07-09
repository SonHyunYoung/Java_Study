import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
	   public static boolean is_prime (int n) {
		   int range = (int) Math.sqrt(n);
		   
		   if(n < 2) {
			   return false;
		   }
		   
		   else if(n == 2) {
			   return true;
		   }
		   else {
			   for(int i = 2; i <= range; i++) {
				   if(n % i == 0) {
					   return false;
				   }
			   }
			   
			   return true;
		   }
		   
	   }
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	int cnt = 0;
        	
        	if(n == 0) {
        		break;
        	}
        	
        	for(int i = n + 1; i <= n * 2; i++) {
        		if(is_prime(i)) {
        			cnt++;
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
