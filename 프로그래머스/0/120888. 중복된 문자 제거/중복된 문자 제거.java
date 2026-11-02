import java.util.ArrayList;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(answer.indexOf(my_string.charAt(i)) != -1){
                continue;
            }
            
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}