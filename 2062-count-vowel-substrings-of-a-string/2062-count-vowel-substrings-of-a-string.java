class Solution {
    public int countVowelSubstrings(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        int vowels = 0;
        for(int i = 0 ; i < word.length() ; i++) {
            map.clear();
            for(int j = i ; j < word.length() ; j++){
                char ch = word.charAt(j);
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    map.put(ch,map.getOrDefault(ch,0)+1);
                    if(map.containsKey('a') && map.containsKey('e') && map.containsKey('i') && map.containsKey('o') && map.containsKey('u'))vowels++;
                }
                else break;
            }
        }
        return vowels;
    }
}