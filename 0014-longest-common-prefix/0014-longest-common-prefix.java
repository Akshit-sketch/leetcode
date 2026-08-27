class Solution {
    public String longestCommonPrefix(String[] s) {
        Arrays.sort(s);
        String start = s[0];
        String last = s[s.length-1];
        int i = 0;
        int max = Math.min(start.length(),last.length());
        StringBuilder res = new StringBuilder();
        while(i < max && start.charAt(i) == last.charAt(i)){
            res.append(start.charAt(i));
            i++;
        }
        return res.toString();
    }
}