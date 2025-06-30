import java.io.*;
import java.util.ArrayList;
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
         
       
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> prime = new ArrayList<>(); //소수 배열 선언
        
        int sum = 0;
        
        for(int i = M; i <= N; i++) {
        	if(is_prime(i)) {
        		sum += i;
        		prime.add(i);
        	}
        }
        
       if(sum == 0) {
    	   bw.write("-1");
    	   bw.flush();
    	   
    	   br.close();
    	   bw.close();
       }
       
       else {
    	   bw.write(String.valueOf(sum));
    	   bw.newLine();
    	   bw.write(String.valueOf(prime.get(0)));
    	   bw.flush();
    	   
    	   bw.close();
    	   br.close();
       }
   }
}