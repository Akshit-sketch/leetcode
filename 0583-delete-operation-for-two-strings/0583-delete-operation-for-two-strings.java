class Solution {
    public int LCS(String s1,String s2 , int n1 , int n2 ,int dp[][]){
        if( n1 == 0 || n2 == 0)return 0;
        if(dp[n1][n2] != -1)return dp[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            return dp[n1][n2] = 1 + LCS(s1,s2,n1-1,n2-1,dp);
        }
        int left = LCS(s1,s2,n1-1,n2,dp);
        int right = LCS(s1,s2,n1,n2-1,dp);
        return dp[n1][n2] = Math.max(left,right);
    }
    public int minDistance(String word1, String word2) {
        int n1 = word1.length();
        int n2 = word2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int row[] : dp)Arrays.fill(row,-1);
        int lcs = LCS(word1,word2,n1,n2,dp);
        int smaller = Math.min(word1.length(),word2.length());
        int bigger = Math.max(word1.length(),word2.length());
        return (smaller+bigger) - 2 * lcs;
    }
}