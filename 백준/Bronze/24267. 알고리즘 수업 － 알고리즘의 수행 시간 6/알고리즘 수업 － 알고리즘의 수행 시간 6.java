import java.io.*;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         long n = Long.parseLong(br.readLine());
         long count = 0;
         
         long range = n - 2;
         
         for(long i = range; i >= 1; i--) {
        	 count += i * (i + 1) / 2;
         }
         
         
         
         bw.write(String.valueOf(count));
         bw.newLine();
         bw.write(String.valueOf(3));
         bw.flush();
         
         bw.close();
         br.close();
         
        }
   }	
