	import java.util.Scanner;
	import java.util.Stack;
	
	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			Stack<Integer> stackInt = new Stack<>();
					
			int num = sc.nextInt();
			int repeat = sc.nextInt();
			
			int basket[] = new int[num];
			
			for(int i = 0; i < num; i++) {
				basket[i] = i + 1;
			}
			
			for(int i = 0; i < repeat; i++) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int tmp;
				
				for(int j = n - 1; j < m; j++) {
					stackInt.push(basket[j]);
				}
				
				for(int k = n-1; k < m; k++) {
					basket[k] = stackInt.pop();
				}
			}
			
			for(int i = 0; i < num; i++) {
				System.out.printf("%d ", basket[i]);
			}
		}
	}