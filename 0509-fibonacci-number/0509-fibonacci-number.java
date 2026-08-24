class Solution {
    public int fib(int n) {
        if(n <= 1)return n;
        int last = 1;
        int secondlast = 0;
        for(int i = 2 ; i <= n ; i++){
            int temp = secondlast+last;
            secondlast = last;
            last =  temp;
        }
        return last;
    }
}