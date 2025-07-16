import java.io.*;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
	
	public static void main(String [] args) throws IOException{
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken()); //단어의 개수
		int m = Integer.parseInt(st.nextToken()); //외우는 기준이 되는 수
		
		HashMap<String, Integer> hash = new HashMap<>();
		
		//단어 입력 받기
		for(int i = 0; i < n; i++) {
			String word = br.readLine();
			
			if(word.length() < m) {
				continue;
			}
			
			hash.put(word, hash.getOrDefault(word, 0) + 1);
			
		}
		
		List<String> str = new ArrayList<>(hash.keySet());

		bw.flush();
		
		Collections.sort(str, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2) {
				if(Integer.compare(hash.get(s1), hash.get(s2)) != 0) {
					return Integer.compare(hash.get(s2), hash.get(s1));
				}
				if(s1.length() != s2.length()) {
					return s2.length() - s1.length();
				}
				
				return s1.compareTo(s2);
				
			}
		});
		
		for(String s : str) {
			bw.write(s);
			bw.newLine();
		}
		
		bw.flush();
		
		br.close();
		bw.close();
	}
}