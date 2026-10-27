class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        String [] temp = myString.split("x", -1);
        
        answer = new int [temp.length];
        
        for(int i = 0; i < temp.length; i++){
            answer[i] = temp[i].length();
        }         
        
        return answer;
    }
}