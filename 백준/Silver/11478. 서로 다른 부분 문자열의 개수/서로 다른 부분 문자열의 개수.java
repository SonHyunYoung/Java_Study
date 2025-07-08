import java.io.*;
import java.util.HashSet;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        String str = br.readLine();
        int len = str.length();
        
        HashSet<String> sub = new HashSet<>();
        
        
        for(int i = 1; i <= len; i++) {
        	for(int j = 0; j <= len - i; j++) {
        		sub.add(str.substring(j, j + i));
        	}
        }
        
        int size = sub.size();
        
        bw.write(size + "");
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
