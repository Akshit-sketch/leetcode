class Solution {
    public int atmost(int[] nums,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        int left = 0;
        int count = 0;
        for ( int right = 0 ; right < nums.length ; right++ ) {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);
            while(map.size() > k){
                int val = map.get(nums[left])-1;
                if(val == 0)map.remove(nums[left]);
                else map.put(nums[left],val);
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k)-atmost(nums,k-1);
    }
}