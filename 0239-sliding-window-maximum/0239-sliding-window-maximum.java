class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int left = 0;
        int right = 0;
        int index = 0;
        int res[] = new int[n-k+1];
        while(right < n){
            while(!dq.isEmpty() && nums[right] > dq.peekLast()){
                dq.removeLast();
            }
            dq.addLast(nums[right]);
            if(right - left + 1 == k){
                res[index++] = dq.peekFirst();
                if(dq.peekFirst() == nums[left]){
                    dq.removeFirst();
                }
                left++;
            }
            right++;
        }
        return res;
    }
}