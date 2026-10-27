class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'a' || myString.charAt(i) == 'A'){
                answer += 'A';
            }
            else {
                char temp = myString.charAt(i);
                
                answer += Character.toLowerCase(temp);
            }
        }
        return answer;
    }
}