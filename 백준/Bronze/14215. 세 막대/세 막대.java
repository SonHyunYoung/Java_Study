import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int [] s = new int[3];
         int i = 0;
         
         while(st.hasMoreTokens()) {
        	 s[i] = Integer.parseInt(st.nextToken());
        	 i++;
         }
         
         Arrays.sort(s);
         
         int len;
         
         if(s[2] >= s[0] + s[1]) {
        	 while(s[2] >= s[0] + s[1]) {
        		 s[2]--;
        	 }
        	 
        	 len = s[0] + s[1] + s[2];
        	 
         }
         
         else {
        	 len = s[0] + s[1] + s[2];
         }
         
         bw.write(String.valueOf(len));
         bw.flush();
     
         bw.close();
         br.close();

        }
   }	
