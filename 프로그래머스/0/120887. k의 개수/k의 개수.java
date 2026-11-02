class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int start = i; start <= j; start++){
            int temp = start;
            
            while(temp != 0){
                if(temp % 10 == k){
                    answer++;
                }
                
                temp /= 10;
            }
        }
        
        return answer;
    }
}