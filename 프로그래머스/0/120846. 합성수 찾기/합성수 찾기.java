import java.util.ArrayList;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(n > 3){
            for(int i = 1; i <= (int) Math.sqrt(n); i++){
                if(n % i == 0){
                   list.add(i);
                   
                    if(n / i != n){
                        list.add(n / i);
                    }
                }
            }
            
            if(list.size() >= 3){
                answer++;
            }
            
            list.clear();
            n--;
            
        }
        return answer;
    }
}