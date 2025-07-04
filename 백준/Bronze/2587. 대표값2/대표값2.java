import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < 5; i++) {
        	arr.add(Integer.parseInt(br.readLine()));
        }
        
        arr.sort(Comparator.naturalOrder());
        
        int sum = 0;
        for(int i = 0; i < 5; i++) {
        	sum += arr.get(i);
        }
        
        int averge = sum / 5;
        int median = arr.get(2);
        
        bw.write(averge + "");
        bw.newLine();
        bw.write(median + "");
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
