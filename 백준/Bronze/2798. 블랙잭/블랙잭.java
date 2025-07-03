import java.io.*;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         
         int [] card = new int [N];
         
         StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
         
         for(int i = 0; i < N; i++) {
        	 card[i] = Integer.parseInt(st2.nextToken());
         }
         
         int result = 0, sum;
         
         for(int i = 0; i < N - 2; i++) {
        	 for(int j = i + 1; j < N - 1; j++) {
        		for(int k = j + 1; k < N; k++) {
        			sum = card[i] + card[j] + card[k];
        			
        			if((result <sum ) && (sum <= M)){
        				result = sum;
        			}
        		}
        	 }
         }
         
         bw.write(String.valueOf(result));
         bw.flush();
         
         bw.close();
         br.close();
         	
        }
   }	
