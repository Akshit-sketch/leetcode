class Solution {
    public String reverse(String s){
        return new StringBuilder(s).reverse().toString();
    }
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>();
        String temp = "";
        for ( int i = 0 ; i < s.length() ; i++ ) {
            char ch = s.charAt(i);
            if(ch == '('){
                st.add(temp);
                temp = "";
            }
            else if(ch == ')'){
                temp = st.pop() + reverse(temp); 
            }
            else{
                temp += ch;
            }
        }
        
        return temp;
    }
}