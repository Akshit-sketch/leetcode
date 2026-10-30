class Solution {
    public boolean checkValidString(String s) {
        int low = 0;
        int high = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                low++;
                high++;
            }
            else if(ch == '*'){
                if(low > 0)low--;
                high++; 
            }
            else{
                if(low > 0)low--;
                if(high == 0)return false;
                else high--;
            }
        }
        return low == 0;
    }
}