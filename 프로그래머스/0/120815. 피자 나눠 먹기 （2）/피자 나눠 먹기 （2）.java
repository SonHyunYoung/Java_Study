class Solution {
    public int solution(int n) {
        int lcm = 0;
        int i = 1;
        
        //6과 n 최소공배수 구하기
        while(true){
            if((6 * i) % n == 0 && (6 * i) % 6 == 0){
                lcm = 6 * i;
                break;
            }
            
            i++;
        }
        //최소공배수 / 6 return하기
        return lcm / 6;
    }
}