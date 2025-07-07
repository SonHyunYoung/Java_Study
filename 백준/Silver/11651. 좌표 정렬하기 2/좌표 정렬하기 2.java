import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

   public class Main  {
	   
      public static void main(String [] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
       int coordi [][] = new int[N][2];
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	coordi[i][1] = Integer.parseInt(st.nextToken());
        	coordi[i][0] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(coordi, (e1, e2) -> {
        	if(e1[0] == e2[0]) {
        		return e1[1] - e2[1];
        	}
        	else {
        		return e1[0] - e2[0];
        	}
        	
        });
        
        for(int i = 0; i < N; i++) {
        	bw.write(coordi[i][1] + "");
        	bw.write(" ");
        	bw.write(coordi[i][0] + "");
        	bw.newLine();
        }
        
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
