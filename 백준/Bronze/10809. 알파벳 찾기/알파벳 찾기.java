	import java.util.Scanner;

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String str = sc.next();
			char [] word = str.toCharArray();
			
			int [] sequence = new int[26];
			
			for(int i = 0; i < 26; i++) {
				sequence[i] = -1;
			}
			
			for(int i = 0; i < str.length(); i++) {
				if(sequence[word[i] - 'a'] == -1) {
					sequence[word[i] - 'a'] = i; 
				}
			}
			
			for(int i = 0; i < 26; i++) {
				System.out.printf("%d ", sequence[i]);
			}
		}
	}