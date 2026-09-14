class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0 ; i  < n ; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],new ArrayList<Integer>());
            }
            map.get(nums[i]).add(i);
        }
        int count = 0;
        for(ArrayList<Integer> list : map.values()){
            if(list.size() < 3)continue;
            int diff = list.get(1) - list.get(0);
            boolean valid = true;
            for(int i = 2 ; i < list.size() ; i++){
                if(list.get(i) - list.get(i-1) != diff){
                    valid = false;
                    break;
                }
            }
            if(valid)count++;
        }
        return count;
    }
}