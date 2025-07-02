import java.io.*;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         long n = Long.parseLong(br.readLine());
         n = (long) Math.pow(n, 2);
         
         bw.write(String.valueOf(n));
         bw.newLine();
         bw.write(String.valueOf(2));
         bw.flush();
         
         bw.close();
         br.close();
         
        }
   }	
