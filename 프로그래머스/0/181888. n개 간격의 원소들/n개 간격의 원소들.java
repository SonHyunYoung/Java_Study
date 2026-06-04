class Solution {
    public int[] solution(int[] num_list, int n) {
        int size = (int) Math.ceil((double) num_list.length / n);
        int[] answer = new int[size]; 
        int i = 0;
        int index = 0;
        
        while(index < num_list.length){
            answer[i] = num_list[index]; 
            i++;
            index += n;
        }
        
        return answer;
    }
}