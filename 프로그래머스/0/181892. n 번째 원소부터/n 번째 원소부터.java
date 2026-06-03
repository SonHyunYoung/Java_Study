import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        int range = num_list.length;
        
        answer = Arrays.copyOfRange(num_list, n - 1, range);
        
        return answer;
    }
}