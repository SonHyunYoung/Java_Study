import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

   public class Main  {
      
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
       
         while(true) {
        	 int N = Integer.parseInt(br.readLine());
        	 
        	 if(N == -1) {
        		 bw.close();
        		 br.close();
        		 
        		 break;
        	 }
        	 
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
             
             int sum = 0;
             for(int i = 0; i < arr.size() - 1; i++) {
            	 sum += arr.get(i);
             }
             
             if(sum == N) {
            	 bw.write(String.valueOf(N) + " = ");
            	 
            	 for(int i = 0; i < arr.size() - 1; i++) {
            		
            		 if(i != arr.size() - 2) {
            			 bw.write(String.valueOf(arr.get(i)) + " + ");
            		 }
            		 else {
            			 bw.write(String.valueOf(arr.get(i)));
            		 }
            	 }
            	 
            	 bw.newLine();
            	 bw.flush();
             }
         
             else {
            	 bw.write(String.valueOf(N) + " is NOT perfect.");
            	 bw.newLine();
            	 bw.flush();
             }		 
         }         
   }
}