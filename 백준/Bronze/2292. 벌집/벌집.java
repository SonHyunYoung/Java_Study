import java.io.*;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         int n = Integer.parseInt(br.readLine());
         br.close();
         
         int i = 1;
         int start = 2;
         
         if(n != 1) {
        	 while(true) {
                 int last = start + ((6 * i) - 1);
                 
                 if(start <= n && n <= last) {
                	i++;
                    break;
                    
                 }
                 
                 start = last + 1;
                 i ++;
              }
        	 
        	 bw.write(String.valueOf(i));
             bw.flush();
             bw.close();
         }
         else {
        	 bw.write(String.valueOf(i));
             bw.flush();
             bw.close();
         }
   }
}