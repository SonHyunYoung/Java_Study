import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
         int N = Integer.parseInt(br.readLine());
         int n = (int) Math.sqrt(N);
         
         for(int i = 2; i <= n; i++) {
        	 while(N % i == 0) {
        		 bw.write(String.valueOf(i));
        		 bw.newLine();
        		 bw.flush();
        		 
        		 N /= i;
        	 }
         }
         
         if(N != 1) {
        	 bw.write(String.valueOf(N));
        	 bw.flush();
         }
         
         bw.close();
         br.close();
   }
}