import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
	  public static long gdc(long a, long b) {
		  long min;
		  long gdc = 0;
		  
		  if(a > b) {
			  min = a;
		  }
		  else {
			  min = b;
		  }
		  
		  for(long i = 1; i <= min; i++) {
			  if(a % i == 0 && b % i == 0) {
				  gdc = i;
			  }
		  }
		  
		  return gdc;
	  }
	  
	  public static long lcm(long a, long b) {
		  long gdc = gdc(a, b);
		  
		  return (a * b) / gdc;
	  }
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        bw.write(lcm(a,b) + "");
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
