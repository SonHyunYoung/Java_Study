class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        char a = my_string.charAt(num1);
        char b = my_string.charAt(num2);
        
        char [] temp = my_string.toCharArray();
        
        temp[num1] = b;
        temp[num2] = a;
        
        answer = new String(temp);
        
        return answer;
    }
}