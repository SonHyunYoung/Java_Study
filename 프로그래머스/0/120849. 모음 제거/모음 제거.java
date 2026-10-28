class Solution {
    public String solution(String my_string) {
        String [] vowel = {"a", "i", "u", "e", "o"};
        
        for(int i = 0; i < vowel.length; i++){
            my_string = my_string.replace(vowel[i], "");
        }
        
        return my_string;
    }
}