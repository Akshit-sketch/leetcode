class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        int twenty = 0;
        for(int x : bills){
            if(x == 5)five++;
            else if(x == 10){
                if(five > 0){
                    ten++;
                    five--;
                }
                else return false;
            }
            else{
                if(ten > 0 && five > 0){
                    ten--;
                    five--;
                }
                else if(five >= 3)five -=3;
                else return false;
            }
        }
        return true;
    }
}