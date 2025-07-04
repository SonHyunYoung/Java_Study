import java.io.*;


   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
        int i = 666;
        int count = 0;
        
        String num;
        
        while(true) {
        	num = String.valueOf(i);
        	
        	if(num.contains("666")) {
        		count++;
        	}
        	
        	if(count == N) {
        		break;
        	}
        	i++;
        }
         
         bw.write(String.valueOf(i));
         bw.flush();
         
         bw.close();
         br.close();
        }
   }	
