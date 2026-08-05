class Solution {
    public int jump(int[] nums) {
        int start = 0;
        int end = 0;
        int max = 0;
        int jumps = 0;
        int n = nums.length;
        while(start < n-1){
            max = Math.max(max,start+nums[start]);
            if(start == end){
                jumps++;
                end = max;
            }
            start++;
        }
        return jumps;
    }
}