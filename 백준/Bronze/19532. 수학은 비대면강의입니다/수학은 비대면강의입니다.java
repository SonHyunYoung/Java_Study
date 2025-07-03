import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int a = Integer.parseInt(st.nextToken());
         int b = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         int d = Integer.parseInt(st.nextToken());
         int e = Integer.parseInt(st.nextToken());
         int f = Integer.parseInt(st.nextToken());
         
         int x = 0, y = 0;
         
         for(int i = -999; i <= 999; i++) {
        	 for(int j = -999; j <= 999; j++) {
        		 int compute1 = (a * i) + (b * j);
        		 int compute2 = (d * i) + (e * j);
        		 
        		 if((compute1 == c) && (compute2 == f)) {
        			 x = i;
        			 y = j;
        			 
        			 break;
        		 }
        	 }
         }
         
         bw.write(String.valueOf(x));
         bw.write(" ");
         bw.write(String.valueOf(y));
         bw.flush();
         
         bw.close();
         br.close();
        }
   }	
