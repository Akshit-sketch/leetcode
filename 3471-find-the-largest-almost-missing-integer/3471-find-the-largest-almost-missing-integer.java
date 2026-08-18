class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        HashSet<Integer> set = new HashSet<>();
        while(i < k){
            set.add(nums[i]);
            i++;
        }
        for(int num : set){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int left = 0;
        while(i < nums.length){
            i++;
            left++;
            set.clear();
            for(int j = left ; j < i ; j++){
                set.add(nums[j]);
            }
            for(int num : set){
                map.put(num , map.getOrDefault(num,0)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                max = Math.max(e.getKey(),max);
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}