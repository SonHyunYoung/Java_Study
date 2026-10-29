import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
       ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length(); i++){
            if(Character.isDigit(my_string.charAt(i))){
                list.add(Integer.parseInt(String.valueOf(my_string.charAt(i)))); 
            }
        }
        
        int answer[] = list.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}