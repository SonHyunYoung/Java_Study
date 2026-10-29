class Solution {
    public int solution(int num, int k) {
        String str = String.valueOf(num);
        String a = String.valueOf(k);
        
        if(!str.contains(a)){
            return -1;
        }
        
        return str.indexOf(a) + 1;
    }
}