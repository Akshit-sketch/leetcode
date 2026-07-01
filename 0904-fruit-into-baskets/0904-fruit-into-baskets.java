class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for ( int right = 0 ; right < fruits.length ; right++ ) {
            int value = 1;
            if(map.containsKey(fruits[right])){
                value = map.get(fruits[right]);
                value++;
            }
            map.put(fruits[right],value);
            while(map.size() > 2){
                int num = map.get(fruits[left]) -1;
                if(num == 0){
                    map.remove(fruits[left]);
                }
                else{
                    map.put(fruits[left],num);
                }
                left++;
            }
            max = Math.max(max,right-left+1);
        } 
        return max;
    }
}