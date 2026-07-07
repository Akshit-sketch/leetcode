class Solution {
    public long sumAndMultiply(int n) {
        if(n == 0)return 0;
        int sum = 0;
        int num = 0;
        int count = 1;
        while(n > 0){
            int digit = n % 10;
            if(digit != 0){
                sum += digit;
                num = digit*count + num;
                count*=10;
            }
            n /= 10;
        }
        return (long) num * sum;
    }
}