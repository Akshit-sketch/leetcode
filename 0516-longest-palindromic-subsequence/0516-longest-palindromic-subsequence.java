class Solution {
    public int lcs(String s1, String s2, int n1, int n2, int[][] dp){
        if(n1 == 0 || n2 == 0)return 0;
        if(dp[n1][n2] != -1)return dp[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            return dp[n1][n2] = 1 + lcs(s1,s2,n1-1,n2-1,dp);
        }
        return dp[n1][n2] = Math.max(lcs(s1,s2,n1,n2-1,dp),lcs(s1,s2,n1-1,n2,dp));
    }
    public int longestPalindromeSubseq(String s1) {
        String s2 = new StringBuilder(s1).reverse().toString();
        int n1 = s1.length();
        int n2 = s2.length();
        int dp [][] = new int[n1+1][n2+1];
        for(int [] row : dp)Arrays.fill(row,-1);
        return lcs(s1,s2,n1,n2,dp);
    }
}