class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1)return x;
        int prev = 0;
        for(int i = 1 ; ; i++){
            long res = (long) i * i;
            if(res == x)return i;
            if(res > x)return prev;
            prev = i;
        }
    }
}