	import java.util.Scanner;
	import java.util.Stack;
	
	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			Stack<Character> stackStr1 = new Stack<>();
			Stack<Character> stackStr2 = new Stack<>();
			
			String a = sc.next();
			String b = sc.next();
			
			char [] num1 = a.toCharArray();
			char [] num2 = b.toCharArray();
			
			for(int i = 0; i < 3; i++) {
				stackStr1.push(num1[i]);
				stackStr2.push(num2[i]);
			}
			
			for(int i = 0; i < 3; i++) {
				num1[i] = stackStr1.pop();
				num2[i] = stackStr2.pop();
			}
			
			
			int num_1 = Integer.parseInt(String.valueOf(num1));
			int num_2 = Integer.parseInt(String.valueOf(num2));
			
			if(num_1 > num_2) {
				System.out.print(num1);
			}
			else {
				System.out.print(num2);
			}
		}
	}