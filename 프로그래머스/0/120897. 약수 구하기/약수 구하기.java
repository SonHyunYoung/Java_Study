import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 1; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                
                if(i != n / i){
                    list.add(n / i);
                }
            }
        }
        
        
        answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}