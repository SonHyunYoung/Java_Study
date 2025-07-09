import java.io.*;

   public class Main  {
	  public static int gdc(int a, int b) {
		  if (b == 0) 
			  return a;
		  else
			  return gdc(b, a % b);
	  }
	  
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int n = Integer.parseInt(br.readLine());
        
        int [] temp = new int [n];
        
        for(int i = 0; i < n; i++) {
        	temp[i] = Integer.parseInt(br.readLine());
        }
        
        int gdc = 0;
        
        for(int i = 0; i < n - 1; i++) {
        	int dis = temp[i + 1] - temp[i];
        	gdc = gdc(dis, gdc);
        }
        
        int len = ((temp[n - 1] - temp[0]) / gdc + 1) - (temp.length);
        
        
        bw.write(len + "");
        bw.flush();
        
        bw.close();
        br.close();
        
        }
   }	
