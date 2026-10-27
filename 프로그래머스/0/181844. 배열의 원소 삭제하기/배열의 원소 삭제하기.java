import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
            
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]){
                    list.remove(list.size() - 1);
                    break;
                }
            }
        }
        
        answer = new int [list.size()];
        
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}