class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        if(n == 0)return 0;
        int[] maxarr = new int[n];
        int[] minarr = new int[n];
        maxarr[0] = nums[0];
        for(int i = 1 ; i < n ; i++){
            if(nums[i] > maxarr[i-1]){
                maxarr[i] = nums[i];
            }
            else{
                maxarr[i] = maxarr[i-1];
            }
        }
        minarr[n-1] = nums[n-1];
        for(int i = n-2 ; i >= 0; i--){
            if(nums[i] < minarr[i+1]){
                minarr[i] = nums[i];
            }
            else{
                minarr[i] = minarr[i+1];
            }
        }
        for(int i = 0 ; i < n ; i++){
            if(maxarr[i] - minarr[i] <= k)return i;
        }
        return -1;
    }
}