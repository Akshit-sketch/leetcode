class Solution {
    public int maxVowels(String s, int k) {
        int max = 0;
        int vowels = 0;
        int left = 0;
        for ( int right = 0 ; right < s.length() ; right++ ) {
            char ch = s.charAt(right);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')vowels++; 
            if(right+1 > k){
                char last = s.charAt(left);
                if(last == 'a' || last == 'e' || last == 'i' || last == 'o' || last == 'u')vowels--;
                left++;
            }
            max = Math.max(vowels,max);
        }
        return max;
    }
}