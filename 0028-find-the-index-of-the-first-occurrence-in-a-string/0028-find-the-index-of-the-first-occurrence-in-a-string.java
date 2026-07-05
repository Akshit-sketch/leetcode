class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0 ; i <= haystack.length()-needle.length() ; i++){
            int j = 0;
            if(haystack.charAt(i) == needle.charAt(j)){
                while(haystack.charAt(i+j) == needle.charAt(j)){
                    j++;
                    if(j == needle.length())return i;
                }
            }
        }
        return -1;
    }
}