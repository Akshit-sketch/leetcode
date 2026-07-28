class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        int n = s.length();
        for ( int i = 0 ; i < n/2 ; i++ ) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        int index = 0;
        StringBuilder sb = new StringBuilder();
        
        for ( int i = 0 ; i < 26 ; i++ ) {
            if(freq[i] != 0){
                sb.append((char)(i+'a'));
            }
        }
        
        if(n % 2 != 0){
            sb.append(s.charAt(n/2));
        }

        for ( int i = 25 ; i >= 0 ; i-- ) {
            if(freq[i] != 0){
                sb.append((char)(i+'a'));
            }
        }
        return sb.toString();
    }
}