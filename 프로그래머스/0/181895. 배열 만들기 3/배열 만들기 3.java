import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < intervals.length; i++){
            int [] temp = Arrays.copyOfRange(arr, intervals[i][0], intervals[i][1] + 1);
            
            for(int j = 0; j < temp.length; j++){
                list.add(temp[j]);
            }
        }
        
        answer = new int [list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}