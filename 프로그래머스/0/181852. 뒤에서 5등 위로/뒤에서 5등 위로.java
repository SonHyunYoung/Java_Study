import java.util.*;

class Solution {
    public ArrayList solution(int[] num_list) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < num_list.length; i++){
            list.add(num_list[i]);
        }
        
        Collections.sort(list);
        
        for(int i = 0; i < 5; i++){
            list.remove(0);
        }
        
        return list;
    }
}