import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int [emergency.length];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < emergency.length; i++){
            list.add(emergency[i]);
        }
        
        list.sort(Collections.reverseOrder());
        
        for(int i = 0; i < emergency.length; i++){
            for(int j = 0; j < emergency.length; j++){
                if(emergency[i] == list.get(j)){
                    answer[i] = j + 1;
                }
            }
        }
        
        return answer;
    }
}