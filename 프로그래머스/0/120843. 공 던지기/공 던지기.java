import java.util.Deque;
import java.util.ArrayDeque;

class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i = 0; i < numbers.length; i++){
            dq.addLast(numbers[i]);
        }
        
        for(int i = 1; i < k; i++){
            dq.add(dq.poll());
            dq.add(dq.poll());
        }
        
        return dq.peek();
    }
}