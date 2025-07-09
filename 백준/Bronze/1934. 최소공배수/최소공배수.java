import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
	  public static int gdc(int a, int b) {
		  int min;
		  int gdc = 0;
		  
		  if(a > b) {
			  min = a;
		  }
		  else {
			  min = b;
		  }
		  
		  for(int i = 1; i <= min; i++) {
			  if(a % i == 0 && b % i == 0) {
				  gdc = i;
			  }
		  }
		  
		  return gdc;
	  }
	  
	  public static int lcm(int a, int b) {
		  int gdc = gdc(a, b);
		  
		  return (a * b) / gdc;
	  }
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	bw.write(lcm(a, b) + "");
        	bw.newLine();
        	bw.flush();
        }
        
        bw.close();
        br.close();
        
        }
   }	
