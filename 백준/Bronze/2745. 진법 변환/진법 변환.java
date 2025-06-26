import java.util.Scanner;	

	public class Main {
		public static void main(String [] args) {
			
			Scanner sc = new Scanner(System.in);
			
			String num = sc.next(); //b진법 수
			int b = sc.nextInt(); //진법
			int d = 0; //10진수 변환한 수 저장 
			int len = num.length();
			int power = 0;
			
			for(int i = len - 1; i >= 0; i--) {
				
				int m = 0; //곱하는 수
				
				if('0' <= num.charAt(i) && num.charAt(i) <= '9') {
					m = Integer.parseInt(String.valueOf(num.charAt(i)));
				}
				
				switch(num.charAt(i)) {
				
				case 'A':
					m = 10;
					break;
				case 'B':
					m = 11;
					break;
				case 'C':
					m = 12;
					break;
				case 'D':
					m = 13;
					break;
				case 'E':
					m = 14;
					break;
				case 'F':
					m = 15;
					break;
				case 'G':
					m = 16;
					break;
				case 'H':
					m = 17;
					break;
				case 'I':
					m = 18;
					break;
				case 'J':
					m = 19;
					break;
				case 'K':
					m = 20;
					break;
				case 'L':
					m = 21;
					break;
				case 'M':
					m = 22;
					break;
				case 'N':
					m = 23;
					break;
				case 'O':
					m = 24;
					break;
				case 'P':
					m = 25;
					break;
				case 'Q':
					m = 26;
					break;
				case 'R':
					m = 27;
					break;
				case 'S':
					m = 28;
					break;
				case 'T':
					m = 29;
					break;
				case 'U':
					m = 30;
					break;
				case 'V':
					m = 31;
					break;
				case 'W':
					m = 32;
					break;
				case 'X':
					m = 33;
					break;
				case 'Y':
					m = 34;
					break;
				case 'Z':
					m = 35;
					break;
				}
				
				d += (Math.pow(b, power) * m);
				
				power++;
			}
			
			System.out.print(d);
		}
	}