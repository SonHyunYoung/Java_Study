import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         int [][] s = new int [3][2];
         
         for(int i = 0; i < 3; i++) {
        	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	 
        	 for(int j = 0; j < 2; j++) {
        		 s[i][j] = Integer.parseInt(st.nextToken());
        	 }
         }
         
         int x, y;
         
         //x좌표
         if(s[0][0] == s[1][0]) {
        	 x = s[2][0];
         }
         
         else if(s[0][0] == s[2][0]) {
        	 x = s[1][0];
         }
         else {
        	 x = s[0][0];
         }
         
         //y좌표
         if(s[0][1] == s[1][1]) {
        	y = s[2][1]; 
         }
         else if(s[0][1] == s[2][1]) {
        	 y = s[1][1];
         }
         else {
        	 y = s[0][1];
         }
         
         bw.write(String.valueOf(x));
         bw.write(" ");
         bw.write(String.valueOf(y));
         bw.flush();
         
         bw.close();
         br.close();
         
   }	
}