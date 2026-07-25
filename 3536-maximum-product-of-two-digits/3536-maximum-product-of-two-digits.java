class Solution {
    public int maxProduct(int n) {
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        while ( n > 0 ) {
            int digit = n % 10;
            if ( digit >= max ) {
                secmax = max;
                max = digit;
            }
            else if ( digit > secmax ) {
                secmax = digit;
            }
            n/=10;
        }
        return max*secmax;
    }
}