class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                temp += my_string.charAt(i);
                
                if(i + 1 < my_string.length() && Character.isDigit(my_string.charAt(i + 1))){
                    continue;   
                }
                else{
                    answer += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        
        return answer;
    }
}