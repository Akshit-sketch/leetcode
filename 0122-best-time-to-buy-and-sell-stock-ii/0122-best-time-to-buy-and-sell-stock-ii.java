class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for(int x : prices){
            System.out.println(min);
            if(min >= x)min = x;
            else{
                profit += x-min;
                min = x;
            }
        }
        return profit;
    }
}