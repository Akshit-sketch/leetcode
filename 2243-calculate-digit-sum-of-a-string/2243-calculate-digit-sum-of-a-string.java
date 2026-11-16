class Solution {
    public String digitSum(String s, int k) {
        if(s.length() <= k)return s;
        StringBuilder res = new StringBuilder();
        int counter = 0;
        int sum = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(counter < k){
                sum += ch-'0';
                counter++;
            }
            else{
                res.append(sum);
                counter = 0;
                sum = 0;
                i--;
            }
        }
        if(counter != 0)res.append(sum);
        if(res.toString().length() > k){
            return digitSum(res.toString(),k);
        }
        return res.toString();
    }
}