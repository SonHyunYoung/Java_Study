class Solution {
    public int solution(int[] sides) {
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        //가장 긴 변이 sides의 큰 값인 경우
        int cnt1 = max - (max - min);
        
        //새로 구한 변이 가장 큰 변인 경우(통과)
        int cnt2 = 0;
        int side = max + 1;
        while(side < sides[0] + sides[1]){
            cnt2++;
            side++;
        }
        
        return cnt1 + cnt2;
    }
}