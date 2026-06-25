import java.util.Arrays;

class Solution {
    public int solution(int[] mats, String[][] park) {
        Arrays.sort(mats);
        
        for(int i = mats.length - 1; i >= 0; i--){
            int size = mats[i];
            
            for(int h = 0; h <= park.length - size; h++){
                for(int w = 0; w <= park[0].length - size; w++){
                    if(canPlace(park, h, w, size)){
                        return size;
                    }
                }
            }
        }
        return -1;
    }
    
    public boolean canPlace(String[][] park, int h, int w, int size){
        for(int i = h; i < h + size; i++){
            for(int j = w; j < w + size; j++){
                if(!park[i][j].equals("-1")){
                    return false;
                }
            }
        }
        return true;
    }
}