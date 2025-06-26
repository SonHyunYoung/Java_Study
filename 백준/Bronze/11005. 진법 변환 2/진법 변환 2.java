import java.io.*;
import java.util.StringTokenizer;

	public class Main  {
		public static void main(String [] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int decimal = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			String num = "";
			
			if(decimal > b) {
				while(true) {
					int q = decimal % b; //나머지
					int p = decimal / b; //몫
					decimal /= b;
					
					if(0 <= q && q <= 9) {
						num += String.valueOf(q).toString();
					}
					
					else if(10 <= q && q <= 35) {
						int ascii = q + 55;
						num += (char) ascii;
					}
					
					if(decimal < b) {
						if (0 <= p && p <= 9) {
							num += String.valueOf(p).toString();
						}
						else if(10 <= p && p <= 35) {
							int ascii_2 = p + 55;
							num += (char) ascii_2;
						}
						
						break;
					}
				}
			}
			
			else if(decimal == b) {
				num += "01";
			}
			
			else {
				int q = decimal % b;
				
				if(0 <= q && q <= 9) {
					num += String.valueOf(q).toString();
				}
				else if(10 <= q && q <= 35) {
					int ascii = q + 55;
					num += (char) ascii;
				}
			}
			
			
			int len = num.length() - 1;
 			for(int i = len; i >= 0; i--) {
				System.out.print(num.charAt(i));
			}
			
		}
	}