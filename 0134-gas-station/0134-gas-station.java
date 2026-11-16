class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalcost = 0;
        int totalgas = 0;
        for(int i = 0 ; i < gas.length ; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }
        if(totalcost > totalgas)return -1;

        int money = 0;
        int startIndex = 0;
        for(int i = 0 ; i < gas.length ; i++){
            money += gas[i]-cost[i];
            if(money < 0){
                money = 0;
                startIndex = i+1;
            }
        }
        return startIndex;
    }
}