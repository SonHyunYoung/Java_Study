import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Comparator;


   public class Main  {
	   
      public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
  
        ArrayList<Integer> score = new ArrayList<>();
        
        for(int i = 0; i < N; i++) {
        	score.add(Integer.parseInt(st2.nextToken()));
        }
        
        score.sort(Comparator.reverseOrder());
        
        int cutline = score.get(K - 1);
        
        bw.write(cutline + "");
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
