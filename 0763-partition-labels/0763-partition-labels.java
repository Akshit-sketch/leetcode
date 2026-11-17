class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int[] freq = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            freq[ch-'a'] = i;
        }
        int end = 0;
        int start = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            end = Math.max(end,freq[ch-'a']);
            if(end == i){
                list.add(end-start+1);
                start = end+1;
            }
        }
        return list;
    }
}