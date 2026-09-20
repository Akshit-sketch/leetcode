class Solution {
    public int reverseDegree(String s) {
        int result = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            int rev = 26-index;
            result += (rev) * (i+1);
        }
        return result;
    }
}