import java.util.Scanner;	
import java.util.Stack;

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			Stack<Character> stackChar = new Stack<>();
			
			String input = sc.next();
			char [] word = input.toCharArray();
			
			for(int i = 0; i < input.length(); i++) {
				stackChar.push(word[i]);
			}
			
			for(int i = 0; i < input.length(); i++) {
				word[i] = stackChar.pop();
			}
			
			String reverse = new String(word);
			
			if(input.equals(reverse)) {
				System.out.print('1');
			}
			else {
				System.out.print('0');
			}
		}
	}