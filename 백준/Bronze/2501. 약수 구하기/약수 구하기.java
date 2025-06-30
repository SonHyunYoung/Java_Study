import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
         StringTokenizer st = new StringTokenizer(br.readLine(), " ");
         
         int N = Integer.parseInt(st.nextToken());
         int K = Integer.parseInt(st.nextToken());
         
         int sqrt = (int) Math.sqrt(N);
         ArrayList<Integer> arr = new ArrayList<>();
         
         for(int i = 1; i <= sqrt; i++) {
        	 if(N % i == 0) {
        		 arr.add(i);
        		 if(N / i != i) {
        			 arr.add(N / i);
        		 }
        	 }
         }
         
         arr.sort(Comparator.naturalOrder());
         
         try {
        	 bw.write(String.valueOf(arr.get(K- 1)));
        	 bw.flush();
        	 bw.close();
        	 
        	 br.close();
         }
         catch(IndexOutOfBoundsException e) {
        	 bw.write("0");
        	 bw.flush();
        	 bw.close();
        	 
        	 br.close();
         }
   }
}