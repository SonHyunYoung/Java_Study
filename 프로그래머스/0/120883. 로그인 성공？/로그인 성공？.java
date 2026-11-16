class Solution {
    public String solution(String[] id_pw, String[][] db) {
        int index = 0;
        boolean exist = false;
        
        for(int i = 0; i < db.length; i++){
            if(db[i][0].equals(id_pw[0])){
                index = i;
                exist = true;
                break;
            }
        }
        
        if(!exist){
            return "fail";
        }
        else{
            if(db[index][1].equals(id_pw[1])){
                return "login";
            }
            else{
                return "wrong pw";
            }
        }
    }
}