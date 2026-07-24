class Solution {
    public String minWindow(String s, String t) {
        StringBuilder sb = new StringBuilder();
        HashMap<Character,Integer> map1 = new HashMap<>();
        for ( int i = 0 ; i < t.length() ; i++ ) {
            char ch = t.charAt(i);
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
        HashMap<Character,Integer> map2 = new HashMap<>();
        int min = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        int left = 0;
        int required = map1.size();
        int found = 0;
        for ( int right = 0 ; right < s.length() ; right++ ) {
            char ch = s.charAt(right);
            if(map1.containsKey(ch)){
                map2.put(ch,map2.getOrDefault(ch,0)+1);
                if(map1.get(ch).equals(map2.get(ch))){
                    found++;
                }
            }
            while(required == found){
                if(min > right - left + 1){
                    start = left;
                    end = right+1;
                    min = right-left+1;
                }
                char lefty = s.charAt(left);
                if(map1.containsKey(lefty)){
                    int value = map2.get(lefty);
                    if(value > map1.get(lefty)){
                        left++;
                        value--;
                        map2.put(lefty,value);
                    }
                    else{
                        value--;
                        if(value == 0)map2.remove(lefty);
                        else map2.put(lefty,value);
                        found--;
                        left++;
                    }
                }
                else{
                    left++;
                }
            }
            
        }
        if (start == -1) return "";
        return s.substring(start, end);
    }
}