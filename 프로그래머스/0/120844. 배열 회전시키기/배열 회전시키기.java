class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = {};
        answer = new int [numbers.length];
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        
        if(direction.equals("right")){
            answer[0] = last;
            
            for(int i = 0; i < numbers.length - 1; i++){
                answer[i + 1] = numbers[i];
            }
        }   
        else{
            answer[numbers.length - 1] = first;
            
            for(int i = numbers.length - 1; i > 0; i--){
                answer[i - 1] = numbers[i];
            }
        }
        
        return answer;
    }
}