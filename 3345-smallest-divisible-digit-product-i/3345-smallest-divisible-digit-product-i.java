class Solution {
    public int smallestNumber(int n, int t) {
        for(int i = n ; i <= 100 ; i++){
            System.out.println(i);
            int original = i;
            int product = 1;
            while(original > 0){
                int digit = original % 10;
                product *= digit;
                original /= 10;
            }
            if(product % t == 0)return i;
        }
        return -1;
    }
}