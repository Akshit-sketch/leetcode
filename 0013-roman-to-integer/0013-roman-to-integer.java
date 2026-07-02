class Solution {
    public int romanToInt(String s) {
        int count = 0;
        for ( int i = 0 ; i < s.length() ; i++ ) {
            char ch = s.charAt(i);
            if ( ch == 'I' ) count++;
            else if ( ch == 'V' ){
                if ( i > 0 && s.charAt(i-1) == 'I')count+=3;
                else count+=5;
            }
            else if ( ch == 'X' ){
                if ( i > 0 && s.charAt(i-1) == 'I')count+=8;
                else count+=10;
            }
            else if ( ch == 'L' ) {
                 if ( i > 0 && s.charAt(i-1) == 'X')count+=30;
                 else count+=50;
            }
            else if ( ch == 'C' ){
                 if ( i > 0 && s.charAt(i-1) == 'X')count+=80;
                 else count+=100;
            }
            else if ( ch == 'D' ){
                 if ( i > 0 && s.charAt(i-1) == 'C')count+=300;
                 else count+=500;
            }
            else if ( ch == 'M' ){
                 if ( i > 0 && s.charAt(i-1) == 'C')count+=800;
                 else count+=1000;
            }
        }
        return count;
    }
}