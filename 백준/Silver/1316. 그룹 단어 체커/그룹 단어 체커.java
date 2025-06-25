import java.util.Scanner;	

	public class Main {
		public static boolean Check(String s) {
			
			int [] check = new int[26];
			
			for(int i = 0; i < s.length(); i++) {
				check[s.charAt(i) - 'a']++;
			}
			
			for(int i = 0; i < 26; i++) {
				if(check[i] > 1) {
					int first = s.indexOf((char) (i + 'a'));
					int last = s.lastIndexOf((char) (i + 'a'));
					
					for(int j = first; j < last; j++) {
						if(s.charAt(j) == s.charAt(j + 1)) {
							continue;
						}
						else {
							return false;
						}
					}
				}
			}
			
			return true;
		}
		
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			int cnt = 0;
			
			for(int i = 0; i < num; i++) {
				String input = sc.next();
				
				if(Check(input)) {
					cnt++;
				}
			}
			
			System.out.print(cnt);
			
		}
	}