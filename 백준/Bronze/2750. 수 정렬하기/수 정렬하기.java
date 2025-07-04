import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
        	arr.add(Integer.parseInt(br.readLine()));
        }
        
        arr.sort(Comparator.naturalOrder());
        
        for(int i = 0; i < N; i++) {
        	bw.write(arr.get(i) + "");
        	bw.newLine();
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
