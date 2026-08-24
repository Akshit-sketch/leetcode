class Solution {
    public int climbStairs(int n) {
        int last = 1;
        int slast = 1;
        for ( int i = 2 ; i <= n ; i++ ) {
            int curr = last+slast;
            slast = last;
            last = curr;
        }
        return last;
    }
}