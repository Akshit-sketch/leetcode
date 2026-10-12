class Solution {
    public int[] maxProductPair(int[] nums, int target) {
        int max = Integer.MIN_VALUE;
        int []arr = {-1,-1};
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] + nums[j] == target && nums[i] != nums[j]){
                    int first = nums[i] > nums[j] ? i : j;
                    int second = nums[i] > nums[j] ? j : i;
                    if(nums[i] * nums[j] > max){
                        max = nums[i] * nums[j];
                        arr[0] = first;
                        arr[1] = second;
                    }
                }
            }
        }
        return arr;
    }
}