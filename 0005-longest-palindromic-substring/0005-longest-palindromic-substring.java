class Solution {
    public String longestPalindrome(String s) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int start = -1;
        int end = -1;
        for(int i = 0 ; i < s.length() ; i++){
            int left = i-1;
            int right = i+1;
            int count = 1;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count += 2;
                left--;
                right++;
            } 
            if(max1 < count && count != 1){
                max1 = count;
                start = left+1;
                end = right;
            }
        }
        String s1 = "";
        if(max1 != Integer.MIN_VALUE){
            s1 = s.substring(start,end);
        }
        for(int i = 0 ; i < s.length() ; i++){
            int left = i;
            int right = i+1;
            int count = 0;
            while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
                count+=2;
                left--;
                right++;
            }
            if(max2 < count && count != 0){
                max2 = count;
                start = left+1;
                end = right;
            }
        }
        if(max1 != Integer.MIN_VALUE && max1 > max2){
            return s1;
        }
        else if(max2 != Integer.MIN_VALUE && max2 > max1){
            return s.substring(start,end);
        }
        else return s.substring(0,1);
    }
}