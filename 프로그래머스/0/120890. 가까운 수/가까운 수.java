import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        
        Arrays.sort(array);
        
        int [] distance = new int[array.length];
        
        for(int i = 0; i < array.length; i++){
            int temp = n - array[i];
            
            if(temp < 0){
                temp = (int) Math.abs(temp);
            }
            
            distance[i] = temp;
        }
    
        int min = distance[0];
        
        for(int i = 0; i < distance.length; i++){
            if(distance[i] < min){
                min = distance[i];
                answer = array[i];
            }
        }
        
        return answer;
    }
}