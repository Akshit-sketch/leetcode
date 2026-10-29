class Solution {
    public int candy(int[] arr) {
        int n = arr.length;
        int[] res1 = new int[n];
        int last = 1;
        for(int i = 0 ; i < n ; i++){
            if(i == 0 || arr[i] <= arr[i-1]){
                last = 1;
            }
            else{
                last++;
            }
            res1[i] = last;
        }
        int total = 0;
        last = 1;
        for(int i = n-1 ; i >= 0 ; i--){
            if(i == n-1 || arr[i] <= arr[i+1]){
                last = 1;
            }
            else{
                last++;
            }
            total += Math.max(res1[i],last);
        }
        return total;
    }
}