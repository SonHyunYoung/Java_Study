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
         
       
        int N = Integer.parseInt(br.readLine());
        int [] arr = new int [100];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < N; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int cnt = 0;
        
        for(int i = 0; i < N; i++) {
        	if(is_prime(arr[i])) {
        		cnt++;
        	}
        }
        
        
        bw.write(String.valueOf(cnt));
        bw.flush();
        
        
        br.close();
        bw.close();
             
   }
}