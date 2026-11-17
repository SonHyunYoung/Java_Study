import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0; i < num_list.length; i++){
            q.add(num_list[i]);
        }
        
        for(int i = 0; i < n; i++){
            int temp = q.poll();
            q.add(temp);
        }
        
        return q.stream().mapToInt(i -> i).toArray();
    }
}