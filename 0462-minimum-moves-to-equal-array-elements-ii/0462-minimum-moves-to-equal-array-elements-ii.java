class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int median = nums[nums.length/2];
        int total = 0;
        for(int x : nums){
            total += Math.abs(median-x);
        }
        return total;
    }
}