class Solution {
    public String[] solution(String[] names) {
        int len = names.length / 5;
        
        if(names.length % 5 != 0){
            len++;
        }
        
        String [] answer = new String [len];
        int index = 0;
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = names[index];
            index += 5;
        }
        
        return answer;
    }
}