class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int a = 0 , b = 0 , c = 0;
        for ( int right = 0 ; right < s.length() ; right++ ) {
            char ch = s.charAt(right);
            if(ch == 'a')a++;
            else if (ch == 'b')b++;
            else if(ch == 'c')c++;
            while ( a > 0 && b > 0 && c > 0 ){
                count+= s.length()-right;
                char ch2 = s.charAt(left);
                left++;
                if(ch2 == 'a')a--;
                else if (ch2 == 'b')b--;
                else if(ch2 == 'c')c--;
            }
        }
        return count;
    }
}