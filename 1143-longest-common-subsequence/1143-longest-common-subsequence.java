class Solution {
    public int LCS(String s1 , String s2 , int n1 , int n2 , int dp[][]){
        if(n1 == 0 || n2 == 0)return 0;
        int left = 0;
        int right = 0;
        if(dp[n1][n2] != -1)return dp[n1][n2];
        if(s1.charAt(n1-1) == s2.charAt(n2-1)){
            return dp[n1-1][n2] = 1+ LCS(s1.substring(0,n1-1),s2.substring(0,n2-1),n1-1,n2-1,dp);
        }
        else{
            left = LCS(s1.substring(0,n1-1),s2.substring(0,n2),n1-1,n2,dp);
            right = LCS(s1.substring(0,n1),s2.substring(0,n2-1),n1,n2-1,dp);
        }
        dp[n1-1][n2] = left;
        dp[n1][n2-1] = right;
        return dp[n1][n2] = Math.max(left,right);
    }
    public int longestCommonSubsequence(String text1, String text2) {
        int n1 = text1.length();
        int n2 = text2.length();
        int[][] dp = new int[n1+1][n2+1];
        for(int row[] : dp)Arrays.fill(row,-1);
        return LCS(text1 , text2 , n1 , n2 , dp);
    }
}