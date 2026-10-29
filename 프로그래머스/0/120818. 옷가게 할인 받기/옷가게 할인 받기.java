class Solution {
    public int solution(int price) {
        double discount = 0;
        
        if(100000 <= price && price < 300000){
            discount = price * 0.05;
        }
        else if(300000 <= price && price < 500000){
            discount = price * 0.1;
        }
        else if(500000 <= price){
            discount = price * 0.2;
        }
        
        double result = (double) price - discount;
        
        return (int) Math.floor(result); 
    }
}