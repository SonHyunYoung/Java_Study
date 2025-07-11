import java.io.*;
import java.util.Stack;

   public class Main  {
	  public static String check(String s) {
		  Stack<Character> check = new Stack<>();
		  
		  for(int i = 0; i < s.length(); i++) {
			  if(s.charAt(i) == '(' || s.charAt(i) == '[') {
				  check.push(s.charAt(i));
			  }
			  else if(s.charAt(i) == ')') {
				  if(check.empty() || check.peek() != '(') {
					  return "no";
				  }
				  else {
					  check.pop();
				  }
			  }
			  else if(s.charAt(i) == ']') {
				  if(check.empty() || check.peek() != '[') {
					  return "no";
				  }
				  else {
					  check.pop();
				  }
			  }
		  }
		  
		  if(check.empty()) {
			  return "yes";
		  }
		  else {
			  return "no";
		  }
	  }
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       
        while(true) {
        	String input = br.readLine();
        	
        	if(input.equals(".")){
        		break;
        	}
        	
        	bw.write(check(input));
        	bw.newLine();
        	bw.flush();
        		
        }
            
        bw.close();
        br.close();
        
        }
   }	
