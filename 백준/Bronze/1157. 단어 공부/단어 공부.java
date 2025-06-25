import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String input = sc.next();
			
			int [] count = new int[26];
			
			for(int i = 0; i < input.length(); i++) {
				if('a' <= input.charAt(i) && input.charAt(i) <= 'z') {
					count[input.charAt(i) - 'a']++;
				}
				else {
					count[input.charAt(i) - 'A']++;
				}
			}
			
			int max = -1, index = 0, cnt = 0;
			char print = '?';
			
			//최대값 찾기
			for(int i = 0; i < 26; i++) {
				if(max < count[i]) {
					max = count[i];
					print = (char) (i + 65);
				}
				
				else if(count[i] == max) {
					print = '?';
				}
			}
			
			System.out.print(print);
			
		}
	}