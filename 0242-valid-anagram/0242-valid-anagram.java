class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())return false;
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < s.length() ; i++ ) {
            char ch = s.charAt(i);
            int value = 0;
            if(map.containsKey(ch)){
                value = map.get(ch);
            }
            value++;
            map.put(ch,value);
        }

        for(int i = 0 ; i < t.length() ; i++){
            char ch = t.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                if(freq == 1)map.remove(ch);
                else map.put(ch,freq-1);
            }
            else return false;
        }
        return true;
    }
}