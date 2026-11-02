import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        char [] arr = before.toCharArray();
        char [] arr2 = after.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr2);
        
        if(String.valueOf(arr).equals(String.valueOf(arr2))){
            return 1;
        }
        
        return 0;
    }
}