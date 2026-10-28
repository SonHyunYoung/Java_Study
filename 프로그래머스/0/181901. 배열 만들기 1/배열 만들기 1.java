import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        
        int i = 1;
        
        while(true){
            if(k * i > n){
                break;
            }
        
            list.add(k * i);
            i++;
        }
        
        answer = new int [list.size()];
        
        for(int j = 0; j < list.size(); j++){
            answer[j] = list.get(j);
        }
        
        return answer;
    }
}