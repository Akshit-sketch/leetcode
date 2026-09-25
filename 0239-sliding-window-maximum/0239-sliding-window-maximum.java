class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int n = nums.length;
        int[] res = new int[n-k+1];
        int left = 0;
        int right = 0;
        int index = 0;
        while(right < n){
            while(!dq.isEmpty() && nums[right] > nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(right);
            // System.out.print(dq);
            // System.out.println();
            if(right - left + 1 == k){
                res[index++] = nums[dq.peekFirst()];
                if(dq.peekFirst() == left){
                    dq.removeFirst();
                }
                left++;
            }
            right++;
        }
        return res;
    }
}