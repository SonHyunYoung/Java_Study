	import java.util.Scanner;
	
	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String str = sc.next();
			char [] word = str.toCharArray();
			int sum = 0;
			
			for(int i = 0; i < str.length(); i++) {
				if(word[i] == 'A' || word[i] == 'B' || word[i] == 'C') {
					sum += 3;
				}
				else if(word[i] == 'D' || word[i] == 'E' || word[i] == 'F') {
					sum += 4;
				} 
				else if(word[i] == 'G'|| word[i] == 'H' || word[i] == 'I'){
					sum += 5;
				}
				else if(word[i] == 'J' || word[i] == 'K' || word[i] == 'L') {
					sum += 6;
				} 
				else if(word[i] == 'M' || word[i] == 'N' || word[i] == 'O') {
					sum += 7;
				} 
				else if(word[i] == 'P' || word[i] == 'Q' || word[i] == 'R' || word[i] == 'S') {
					sum += 8;
				} 
				else if(word[i] == 'T' || word[i] == 'U' || word[i] == 'V') {
					sum += 9;
				} 
				else {
					sum += 10;
				}
			}
			System.out.print(sum);
		}
	}