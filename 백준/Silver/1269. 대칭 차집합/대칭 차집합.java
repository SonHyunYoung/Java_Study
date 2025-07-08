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
        
        HashSet<Integer> A = new HashSet<>();
        HashSet<Integer> B = new HashSet<>();
        
        StringTokenizer a = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < N; i++) {
        	int element = Integer.parseInt(a.nextToken());
        	
        	A.add(element);
        }
        
        StringTokenizer b = new StringTokenizer(br.readLine(), " ");
        
        for(int i = 0; i < M; i++) {
        	int element = Integer.parseInt(b.nextToken());
        	
        	B.add(element);
        }
        
        A.retainAll(B);
        
        int count = (N - A.size()) + (M - A.size());
        
        bw.write(count + "");
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
