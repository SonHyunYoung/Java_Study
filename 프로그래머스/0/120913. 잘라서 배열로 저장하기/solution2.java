class Solution {
    public String[] solution(String my_str, int n) {
        int len; //배열 길이
        if(my_str.length() % n == 0){
            len = my_str.length() / n;
        }
        else{
            len = (my_str.length() / n) + 1;
        }
        
        String [] answer = new String[len];
        int index = 0;
        
        for(int i = 0; i < my_str.length(); i += n){
            answer[index] = my_str.substring(i, Math.min(i + n, my_str.length()));
            index++;
        }
        
        return answer;
    }
}
