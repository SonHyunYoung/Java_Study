import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
        String [] str = new String[N];
        
        for(int i = 0; i < N; i++) {
        	str[i] = br.readLine();
        }
        
       Arrays.sort(str);
       
       Arrays.sort(str, (s1, s2) ->{
    	   if(s1.length() == s2.length()) {
    		   return s1.length() - s2.length();
    	   }
    	   else {
    		   return s1.length() - s2.length();
    	   }
    	   
       });
       
    	   
        
       bw.write(str[0]);
       bw.newLine();
       
       for(int i = 1; i < str.length; i++) {
        	if(!(str[i - 1].equals(str[i]))){
        		bw.write(str[i]);
        		bw.newLine();
        	}
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
