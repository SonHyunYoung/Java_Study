import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String str = "";
        
        for(int i = 0; i < a.length(); i++){
            if('A' <= a.charAt(i) && a.charAt(i) <= 'Z'){
                str += Character.toLowerCase(a.charAt(i));
            }
            else if('a' <= a.charAt(i) && a.charAt(i) <= 'z'){
                str += Character.toUpperCase(a.charAt(i));
            }
        }
        
        System.out.print(str);
    }
}