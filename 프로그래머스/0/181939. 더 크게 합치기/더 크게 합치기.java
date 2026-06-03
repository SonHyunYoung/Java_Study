class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String textA = a + "";
        String textB = b + "";
        
        String add1= textA + textB;
        String add2 = textB + textA;
        
        int result1 = Integer.parseInt(add1);
        int result2 = Integer.parseInt(add2);
        
        answer = (result1 > result2) ? result1 : result2;
        
        if(add1 == add2){
            answer = result1;
        }
        
        return answer;
    }
}