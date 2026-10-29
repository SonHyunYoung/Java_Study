class Solution {
    public int solution(int n) {
        int answer = 0;
        int [] div = new int[2];
        
        div[0] = 1;
        div[1] = 10;
        
        while(true){
            if(n / div[1] == 0){
                answer += (n % div[1]) / div[0];
                break;
            }
            
            answer += (n % div[1]) / div[0];
            n -= (n % div[1]);
            div[0] *= 10;
            div[1] *= 10; 
        }
         
        return answer;
    }
}