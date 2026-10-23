class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int left = 0;
        int sum = 0;
        int count = 0;
        for(int right = 0 ; right < arr.length ; right++){
            sum += arr[right];
            if(right - left == k-1){
                if((sum / k) >= threshold){
                    count++;
                }
                sum -= arr[left];
                left++;
            }
        }
        return count;
    }
}