class Solution {
    public int jump(int[] nums) {
        int i = 0 , j = 0;
        int minJump = 0;
        while(j < nums.length-1){
            if(j >= nums.length-1)return minJump;
            int max = 0;
            while(i <= j){
                max = Math.max(nums[i]+i,max);
                i++;
            }
            minJump++;
            j = max;
        }
        return minJump;
    }
}