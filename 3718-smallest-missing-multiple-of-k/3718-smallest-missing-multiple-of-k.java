class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < nums.length; i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int i = k;
        while(i <= 100){
            if(!map.containsKey(i))return i;
            i+=k;
        }
        return i;
    }
}