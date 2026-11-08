class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
        List<List<String>> result = new ArrayList<>();
        int i = 0;
        while(i < s1.length()){
            if(s1.charAt(i) == s2.charAt(i)){
                i++;
                continue;
            }
            int j = i;
            while(j < s1.length() && s1.charAt(j) != s2.charAt(j)){
                j++;
            }
            result.add(Arrays.asList(s1.substring(i,j) , s2.substring(i,j)));
            i = j;
        }
        return result;
    }
}