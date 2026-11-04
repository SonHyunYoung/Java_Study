import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        HashMap<String, String> hash = new HashMap<>();
        
        String answer = "";
        String [] morse = { ".-", "a","-...", "b","-.-.", "c","-..", "d",".","e","..-.","f","--.","g","....","h","..","i",".---","j","-.-","k",".-..","l","--","m","-.","n","---","o",".--.","p","--.-","q",".-.","r","...","s","-","t","..-","u","...-","v",".--","w","-..-","x","-.--","y","--..","z"};
        
        for(int i = 0; i < morse.length; i += 2){
            hash.put(morse[i], morse[i + 1]);
        }
        
        String [] arr = letter.split(" ");
        
        for(int i = 0; i < arr.length; i++){
            answer += hash.get(arr[i]);
        }
        return answer;
    }
}