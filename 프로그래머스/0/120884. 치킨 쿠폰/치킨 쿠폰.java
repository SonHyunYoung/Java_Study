class Solution {
    public int solution(int chicken) {
        int service = chicken / 10;
        int cupon = service + chicken % 10;
        
        while (cupon >= 10) {
            int get = cupon / 10;   
            service += get;
            cupon = get + cupon % 10; 
        }
        return service;
    }
}