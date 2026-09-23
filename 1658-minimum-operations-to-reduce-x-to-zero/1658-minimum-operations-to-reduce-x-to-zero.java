class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        int left = 0;
        int right = 0;
        int max = Integer.MIN_VALUE;
        int k = sum-x;
        if(k < 0)return -1;
        int count = 0;
        while(right < nums.length){
            count += nums[right];
            while(left < nums.length && count > k){
                count -= nums[left];
                left++;
            }
            if(count == k){
                max = Math.max(max,right-left+1);
            }
            right++;
        }
        return max == Integer.MIN_VALUE ? -1 : nums.length-max; 
    }
}