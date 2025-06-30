import java.io.*;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         int x = Integer.parseInt(br.readLine());
         
         int path = 1, prev_count = 0;
         
         while(true) {
        	 if(x <= path + prev_count) {
        		 if(path % 2 == 1) {
        			 int bunmo = x - prev_count;
        			 int bunja = path - (bunmo - 1);
        			 
        			 bw.write(String.valueOf(bunja));
        			 bw.write("/");
        			 bw.write(String.valueOf(bunmo));
        			 bw.flush();
        			 
        			 br.close();
        			 bw.close();
        			 
        			 break;
        		 }
        		 else {
        			 int bunja = x - prev_count;
        			 int bunmo = path - (bunja - 1);
        			 
        			 bw.write(String.valueOf(bunja));
        			 bw.write("/");
        			 bw.write(String.valueOf(bunmo));
        			 bw.flush();
        			 
        			 br.close();
        			 bw.close();
        			 
        			 break;
        		 }
        	 }
        	 else {
        		 prev_count += path;
        		 path++;
        	 }
         }
   }
}