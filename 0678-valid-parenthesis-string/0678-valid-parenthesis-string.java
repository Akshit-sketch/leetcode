class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> open = new Stack<>();
        Stack<Integer> star = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                open.push(i);
            }
            else if(ch == '*'){
                star.push(i);
            }
            else{
                if(!open.isEmpty()){
                    open.pop();
                }
                else{
                    if(star.isEmpty())return false;
                    else{
                        star.pop();
                    }
                }
            }
        }
        while(!open.isEmpty()){
            if(star.isEmpty() || open.peek() > star.peek())return false;
            star.pop();
            open.pop();
        }
        return true;
    }
}