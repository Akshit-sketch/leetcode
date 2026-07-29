class Solution {
    public int characterReplacement(String s, int k) {
        int freq[] = new int[26];
        int maxfreq = 0;
        int maxlength = 0;
        int left = 0;
        for ( int right = 0 ; right < s.length() ; right++ ) {
            freq[s.charAt(right)-'A']++;
            maxfreq = Math.max(freq[s.charAt(right)-'A'],maxfreq);
            while((right-left+1)-maxfreq > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            maxlength = Math.max(right-left+1,maxlength);
        }
        return maxlength;
    }
}