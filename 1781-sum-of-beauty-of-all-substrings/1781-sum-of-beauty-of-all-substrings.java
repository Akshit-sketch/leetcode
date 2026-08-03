class Solution {
    public int beauty(String s){
        int[] freq = new int[26];
        for ( int i = 0 ; i < s.length() ; i++ ) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for ( int i = 0 ; i < 26 ; i++ ) {
            if(freq[i] != 0){
                min = Math.min(freq[i],min);
            }
            max = Math.max(freq[i],max);
        }
        return max-min;
    }
    public int beautySum(String s) {
        int count = 0;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            for(int j = i ; j < s.length() ; j++ ) {
                count+= beauty(s.substring(i,j+1));
            }
        }
        return count;
    }
}