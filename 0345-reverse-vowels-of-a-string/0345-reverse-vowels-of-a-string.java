class Solution {
    public String reverseVowels(String s) {
        StringBuilder vowels = new StringBuilder();
        for ( int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                vowels.append(ch);
            }
        }
        vowels.reverse().toString();
        StringBuilder res = new StringBuilder();
        int index = 0;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
                res.append(vowels.charAt(index));
                index++;
            }
            else{
                res.append(ch);
            }
        }
        return res.toString();
    }
}