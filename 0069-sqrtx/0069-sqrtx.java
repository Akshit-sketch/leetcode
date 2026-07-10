class Solution {
    public int mySqrt(int x) {
        if(x < 2)return x;
        int start = 0;
        int end = x;
        int ans = 0;
        while(start <= end){
            int mid = start + (end-start)/2;
            long sq = (long) mid* mid;
            if(sq == x)return mid;
            else if(sq < x){
                ans = mid;
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }
}