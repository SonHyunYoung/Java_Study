import java.util.ArrayList;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int divide = 2;
        
        while(n > 1){
            if(n % divide == 0){
                list.add(divide);
                
                while(n % divide == 0){
                    n /= divide;
                }    
            }
            
            divide++;
        }
        
        return list.stream().mapToInt(i -> i).toArray();
    }
}
