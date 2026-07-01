class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);
            if(ch >= 'A' && ch <= 'Z')capital++;
        }
        if(capital == 0 || capital == word.length() || (capital == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')))return true;
        return false;
    }
}