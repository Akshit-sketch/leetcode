class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for(int x : prices){
            if(min > x)min = x;
            int profit = x-min;
            max = Math.max(profit,max);
        }
        return max;
    }
}