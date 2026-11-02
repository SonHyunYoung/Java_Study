import java.util.Stack;

class Solution {
    public String solution(int age) {
        
        Stack<Character> stack = new Stack<>();
        String answer = "";
        
        while(age != 0){
            int temp = age % 10;
            
            switch(temp){
                case 0:
                    stack.push('a');
                    break;
                case 1:
                    stack.push('b');
                    break;
                case 2:
                    stack.push('c');
                    break;
                case 3:
                    stack.push('d');
                    break;
                case 4:
                    stack.push('e');
                    break;
                case 5:
                    stack.push('f');
                    break;
                case 6:
                    stack.push('g');
                    break;
                case 7:
                    stack.push('h');
                    break;
                case 8:
                    stack.push('i');
                    break;
                case 9:
                    stack.push('j');
                    break;
            }
            
            age = age / 10;
        }
        
        while(! stack.isEmpty()){
            answer += stack.pop();
        }
        
        return answer;
    }
}