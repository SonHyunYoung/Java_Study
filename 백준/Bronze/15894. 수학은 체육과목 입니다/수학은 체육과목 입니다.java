import java.io.*;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         long N = Long.parseLong(br.readLine());
         long s;
         
         if(N == 1) {
        	 s = 4;
         }
         
         else {
        	 s = N * 4;
         }
         
         bw.write(String.valueOf(s));
         bw.flush();
          
         bw.close();
         br.close();
   }	
}