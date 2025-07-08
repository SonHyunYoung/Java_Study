import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;

   public class Main  {
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        HashSet<String> n = new HashSet<>();
        HashSet<String> m = new HashSet<>();
        
        for(int i = 0; i < N; i++) {
        	n.add(br.readLine());
        }
        
        for(int i = 0; i < M; i++) {
        	m.add(br.readLine());
        }
        
        n.retainAll(m);
        
        ArrayList<String> temp = new ArrayList<>(n);
        
        temp.sort(Comparator.naturalOrder());
        
        bw.write(temp.size() + "");
        bw.newLine();
        
        for(int i = 0; i < temp.size(); i++) {
        	bw.write(temp.get(i));
        	bw.newLine();
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
