import java.io.*;
import java.util.HashSet;
	
public class Main{
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		HashSet<String> set = new HashSet<>();
		
		int gomgom = 0;
		
		for(int i = 0; i < N; i++) {
			String log = br.readLine();
			
			if(log.equals("ENTER")){
				gomgom += set.size();
				
				set = new HashSet<>();
			}
			else {

				set.add(log);
			}
		}
		
		gomgom += set.size();
		
		bw.write(gomgom + "");
		
		br.close();
		bw.close();
	}
}