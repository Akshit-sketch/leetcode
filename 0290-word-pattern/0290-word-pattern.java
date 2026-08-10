class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(str.length != pattern.length())return false;
        HashMap<Character,String> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for ( int i = 0 ; i < pattern.length() ; i++ ){
            char ch = pattern.charAt(i);
            if(map.containsKey(ch)){
                String check = map.get(ch);
                if(!check.equals(str[i]))return false;
            }
            else if(set.contains(str[i])){
                return false;
            }
            else if(!map.containsKey(ch)){
                map.put(ch,str[i]);
                set.add(str[i]);
            }
        }
        return true;
    }
}