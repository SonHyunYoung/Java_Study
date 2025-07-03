import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
	   
	   public static int count(int N, int M, String [] s) {
		   String[] check = {"WBWBWBWB", "BWBWBWBW"};
		   int count = 0;
		   
		   for(int i = 0; i < 8; i++) {
			   int row = N + i;
			   
			   for(int j = 0; j < 8; j++) {
				   int col = M + j;
				   
				   if(check[row % 2].charAt(j) != s[row].charAt(col)) {
					   count++;
				   }
			   }
		   }
		   
		   return Math.min(count, 64 - count);
		   
	   }
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
        
         String [] color = new String [N];
         
         int result = Integer.MAX_VALUE;
         
         for(int i = 0; i < N; i++) {
        	color[i] = br.readLine(); 
         }
         
         int sol = Integer.MAX_VALUE;
         
         for(int i = 0; i < N - 7; i++) {
        	 for(int j = 0; j < M - 7; j++) {
        		 int cnt = count(i, j, color);
        		 
        		 if(cnt < result) {
        			 result = cnt;
        		 }
        	 }
         }
         
         bw.write(result + "");
         bw.flush();
         
         bw.close();
         br.close();
        }
   }	
