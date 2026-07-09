class Solution {
    public int max(int [] arr , int goal){
        if(goal < 0)return 0;
        int left = 0;
        int count = 0;
        int sum = 0;
        for ( int right = 0 ; right < arr.length ; right++ ) {
            sum += arr[right];
            while(sum > goal){
                sum-=arr[left];
                left++;
            }
            count+= right-left+1; 
        }
        return count;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return max(nums,goal) - max(nums,goal-1);
    }
}