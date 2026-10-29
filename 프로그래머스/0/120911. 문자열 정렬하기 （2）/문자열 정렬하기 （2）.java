import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char [] temp = my_string.toLowerCase().toCharArray();
        
        Arrays.sort(temp);
        answer = String.valueOf(temp);
        
        return answer;
    }
}