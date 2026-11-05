class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int [] answer = {0, 0};
        
        int lenRow = board[0] / 2; //가로 길이 범위
        int lenCol = board[1] / 2; //세로 길이 범위
        
        for(int i = 0; i < keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0] > -lenRow){
                    answer[0]--;
                }
            } 
            else if(keyinput[i].equals("right")){
                if(answer[0] < lenRow){
                    answer[0]++;
                }
            } 
            else if(keyinput[i].equals("down")){
                if(answer[1] > -lenCol){
                    answer[1]--;   
                }
            } 
            
            else if(keyinput[i].equals("up")){
                if(answer[1] < lenCol){
                    answer[1]++;
                }
            }
        }
        return answer;
    }
}