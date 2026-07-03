class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        int arr[] = new int[nums.length];
        for(int i = 0 ; i < nums.length; i++){
            if(nums[i] != val){
                count++;
                arr[index] = nums[i];
                index++;
            }
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i];
        }
        return count;
    }
}