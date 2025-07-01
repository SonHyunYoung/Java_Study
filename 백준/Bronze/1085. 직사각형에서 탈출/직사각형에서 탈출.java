import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int x = Integer.parseInt(st.nextToken());
         int y = Integer.parseInt(st.nextToken());
         int w = Integer.parseInt(st.nextToken());
         int h = Integer.parseInt(st.nextToken());
         
         int [] s = new int [4];
         
         s[0] = x;
         s[1] = y;
         s[2] = w - x;
         s[3] = h - y;
         
         int min = s[0];
         
         for(int i = 0; i < 4; i++) {
        	 if(s[i] < min) {
        		 min = s[i];
        	 }
         }
         
         bw.write(String.valueOf(min));
         bw.flush();
         
         bw.close();
         br.close();
   }	
}