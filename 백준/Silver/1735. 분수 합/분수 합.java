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
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int bunja1 = Integer.parseInt(st.nextToken());
        int bunmo1 = Integer.parseInt(st.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        
        int bunja2 = Integer.parseInt(st2.nextToken());
        int bunmo2 = Integer.parseInt(st2.nextToken());
        
        int result_bunmo = lcm(bunmo1, bunmo2);
        int result_bunja = ((result_bunmo / bunmo1) * bunja1) + ((result_bunmo / bunmo2) * bunja2);
        
        int gdc = gdc(result_bunmo, result_bunja);
        
        result_bunmo /= gdc;
        result_bunja /= gdc;
        
        bw.write(result_bunja + " " + result_bunmo);
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
