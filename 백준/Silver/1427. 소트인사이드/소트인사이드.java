import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        String num = br.readLine();
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < num.length(); i++) {
        	arr.add(Integer.parseInt(String.valueOf(num.charAt(i))));
        }
        
        arr.sort(Comparator.reverseOrder());
        
        for(int i = 0; i < arr.size(); i++) {
        	bw.write(arr.get(i) + "");
        }
        
        bw.close();
        br.close();
        }
   }	
