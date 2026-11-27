class Solution {
    public double myPow(double x, int n) {
        long power = n;
        boolean flag = false;
        if(power < 0){
            power = -power;
            flag = true;
        }
        return flag ? 1/fastpow(x,power) : fastpow(x,power);
    }
    public double fastpow(double x,long power){
        if(power == 0)return 1;
        double half = fastpow(x,power/2);
        if(power % 2 == 0){
            return half * half;
        }
        else{
            return x * half *half;
        }
    }
}