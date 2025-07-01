import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         while(true) {
        	 StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	 
        	 int a = Integer.parseInt(st.nextToken());
        	 int b = Integer.parseInt(st.nextToken());
        	 int c = Integer.parseInt(st.nextToken());
        	 
        	 if(a == 0 && b == 0 && c == 0) {
        		 break;
        	 }
        	 
        	 if(a >= b + c || b >= a + c || c >= a + b) {
        		 bw.write("Invalid");
        		 bw.newLine();
        		 bw.flush();
        	 }
        	 else if(a == b && a == c && b == c) {
        		 bw.write("Equilateral");
        		 bw.newLine();
        		 bw.flush();
        	 }
        	 else if(a == b || a == c || b == c) {
        		 bw.write("Isosceles");
        		 bw.newLine();
        		 bw.flush();
        	 }
        	 else {
        		 bw.write("Scalene");
        		 bw.newLine();
        		 bw.flush();
        	 }
        	
         }
        }
   }	
