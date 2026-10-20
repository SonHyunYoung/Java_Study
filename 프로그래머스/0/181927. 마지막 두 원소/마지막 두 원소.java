import java.util.ArrayList;

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        int len = num_list.length;
        
        answer = new int [len + 1];
        
        ArrayList <Integer> list = new ArrayList<>();
        for(int i = 0; i < len; i++){
            list.add(num_list[i]);
        }
        
        if(num_list[len - 1] > num_list[len - 2]){
            list.add(num_list[len - 1] - num_list[len - 2]);
        }
        else{
            list.add(num_list[len - 1] * 2);
        }
        
        for(int i = 0; i <= len; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}