class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        int previousleft = -1;
        int previousright = -1;
        boolean left = true;
        boolean flag = true;
        while(i < j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else{
                if(flag){
                    previousleft = i;
                    previousright = j;
                    i++;
                    flag = false;
                }
                else{
                    if(left){
                        i = previousleft;
                        j = previousright;
                        j--;
                        left = false;
                    }
                    else return false;
                }
            }
        }
        return true;
    }
}