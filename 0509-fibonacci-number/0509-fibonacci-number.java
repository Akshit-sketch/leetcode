class Solution {
    public int opt(int dp[] ,int n){
        if(n <= 1)return n;
        if(dp[n] != -1)return dp[n];
        return dp[n] = opt(dp,n-1)+opt(dp,n-2);
    }
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return opt(dp,n);
    }
}