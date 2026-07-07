class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int left = 0;
        long max = 0;
        long currsum = 0;
        HashSet<Integer> set = new HashSet<>();
        for ( int right = 0 ; right < nums.length ; right++ ) {
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                currsum-=nums[left];
                left++;
            }
            set.add(nums[right]);
            currsum += nums[right];
            while(right - left + 1 > k){
                set.remove(nums[left]);
                currsum -= nums[left];
                left++;
            }
            if(right - left + 1 == k ){
                max = Math.max(max,currsum);
            }
        }
        return max;
    }
}