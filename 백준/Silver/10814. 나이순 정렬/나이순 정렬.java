import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

   public class Main  {
	  public static class Person {
		  int age;
		  String name;
		  
		  public Person(int age, String name){
			  this.age = age;
			  this.name = name;
		  }
	  }
	  
      public static void main(String [] args) throws IOException {
        
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
         
        int N = Integer.parseInt(br.readLine());
        
        Person p [] = new Person [N];
        
        for(int i = 0; i < N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        	
        	int age = Integer.parseInt(st.nextToken());
        	String name = st.nextToken();
        	
        	p[i] = new Person(age, name);
        }
        
        Arrays.sort(p, (e1, e2) -> {
        	if(e1.age == e2.age) {
        		return e1.age - e2.age;
        	}
        	else {
        		return e1.age - e2.age;
        	}
        });
        
        for(int i = 0; i < N; i++) {
        	bw.write(p[i].age + "");
        	bw.write(" ");
        	bw.write(p[i].name);
        	bw.newLine();
        }
        bw.flush();
        
        bw.close();
        br.close();
        }
   }	
