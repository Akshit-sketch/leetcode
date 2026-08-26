class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int min = Integer.MAX_VALUE;
        int start = -1;
        int end = -1;
        for(int i = 0 ; i < s.length() ; i++){
            int count = 0;
            for(int j = i ; j < s.length() ; j++){
                if(s.charAt(j) == '1'){
                    count++;
                }
                if(count == k){
                    if(min > j-i+1){
                        min = j-i+1;
                        start = i;
                        end = j;
                    } 
                    else if(min == j-i+1){
                        String current = s.substring(i,j+1);
                        String previous = s.substring(start,end+1);
                        if(current.compareTo(previous) < 0){
                            start = i;
                            end = j;
                        }
                    }
                    break;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if(start == -1){
            return "";
        }
        else{
            return s.substring(start,end+1);
        }
    }
}