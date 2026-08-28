class Solution {
    public String palli(int left,int right,String s){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return s.substring(left+1,right);
    }
    public String longestPalindrome(String s) {
        String res = "";
        for(int i = 0 ; i < s.length() ; i++){
            String odd = palli(i,i,s);
            String even = palli(i,i+1,s);
            if(odd.length() > res.length()){
                res = odd;
            }
            if(even.length() > res.length()){
                res = even;
            }
        }
        return res;
    }
}