class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int s : nums){
            min = Math.min(s,min); 
        }
        int count = 0;
        for(int s : nums){
            count += s-min;
        }
        return count;
    }
}