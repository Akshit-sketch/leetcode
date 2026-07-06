class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        boolean flag = false;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            char ch = s.charAt(i);
            if(ch != ' ' && flag == false){
                flag = true;
            }
            if(flag == true && ch != ' '){
                count++;
            }
            else if(ch == ' ' && flag == true){
                return count;
            }
        }
        return count;
    }
}