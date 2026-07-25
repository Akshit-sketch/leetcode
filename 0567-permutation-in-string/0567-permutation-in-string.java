class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length())return false;
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        int left = 0;
        int formed = 0;
        int required = map1.size();
        for ( int right = 0 ; right < s2.length() ; right++ ) {
            char ch = s2.charAt(right);
            if(map1.containsKey(ch)){
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                if(map1.get(ch).intValue() == map2.get(ch).intValue()){
                    formed++;
                }
            }
            if(right - left + 1 > s1.length()){
                char lefty = s2.charAt(left);
                if(map1.containsKey(lefty)){
                    if(map1.get(lefty).intValue() == map2.get(lefty).intValue()){
                        formed--;
                    }
                    map2.put(lefty,map2.get(lefty)-1);
                }
                left++;
            }
            if( formed == required && right - left + 1 == s1.length()){
                return true;
            }
        }
        return false;
    }
}