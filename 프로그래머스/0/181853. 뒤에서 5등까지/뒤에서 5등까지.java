import java.util.*;

class Solution {
    public int [] solution(int[] num_list) {
        int answer [] = new int [5];
        
        ArrayList<Integer> list = new ArrayList<>();
        int len = num_list.length;
        
        for(int i = 0; i < len; i++){
            list.add(num_list[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < 5; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}