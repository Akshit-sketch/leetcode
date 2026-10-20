class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int i = 0;
        while(i < costs.length){
            if(costs[i] > coins)break;
            coins -= costs[i];
            i++;
        }
        return i;
    }
}