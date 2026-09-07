class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        long first = 0;
        long total = 0;
        for(int i = 0 ; i < n ; i++){
            if(i < n/2)first+=nums[i];
            total += nums[i];
        }
        int count = 0;
        for(int i = 0 ; i < n ; i++){
            if(first > total-first)count++;
            first = first-nums[i]+nums[(n/2+i) % n];
        }
        return count;
    }
}