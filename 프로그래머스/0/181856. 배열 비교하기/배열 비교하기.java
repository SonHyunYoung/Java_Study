class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        
        int sum1 = 0;
        int sum2 = 0;
        
        if(len1 != len2){
            if(len1 > len2){
                return 1;
            }
            else{
                return -1;
            }
        }
        else{
            for(int i = 0; i < arr1.length; i++){
                sum1 += arr1[i];
                sum2 += arr2[i];
            }
            
            if(sum1 == sum2){
                return 0;
            }
            else if(sum1 > sum2){
                return 1;
            }
            else{
                return -1;
            }
        }
        
    }
}