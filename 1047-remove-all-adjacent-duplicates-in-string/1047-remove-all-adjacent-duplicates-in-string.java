class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(!st.isEmpty()){
                if(st.peek() != ch){
                    st.add(ch);
                }
                else{
                    st.pop();
                }
            }
            else{
                st.add(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}