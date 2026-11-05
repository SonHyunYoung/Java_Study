import java.util.ArrayList;

class Solution {
    boolean isPrime(int a){
        ArrayList<Integer> factor = new ArrayList<>();
        
        for(int i = 1; i <= (int) Math.sqrt(a); i++){
            if(a % i == 0){
                factor.add(i);
                
                if(a / i != i){
                    factor.add(a / i);
                }
            }
        }
        
        if(factor.size() != 2){
            return false;
        } else{
            return true;
        }
    }
    
    public int[] solution(int n) {
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        
        //약수 구하기
        for(int i = 1; i <= (int) Math.sqrt(n); i++){
            if(n % i == 0){
                list.add(i);
                
                if(n / i != i){
                    list.add(n / i);
                }
            }
        }  
        
        for(int i = 0; i < list.size(); i++){
            if(isPrime(list.get(i))){
                temp.add(list.get(i));
            }
        }
        
        return temp.stream()
                 .mapToInt(i -> i)
                 .toArray();
    }
}