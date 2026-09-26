class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(int i = 0 ; i < knowledge.size() ; i++){
            map.put(knowledge.get(i).get(0),knowledge.get(i).get(1));
        }
        StringBuilder result = new StringBuilder();
        boolean flag = false;
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '('){
                flag = true;
                i++;
            }
            else if(flag == false)result.append(s.charAt(i));
            if(flag == true){
                StringBuilder temp = new StringBuilder();
                while(s.charAt(i) != ')'){
                    temp.append(s.charAt(i));
                    i++;
                }
                flag = false;
                if(map.containsKey(temp.toString()))result.append(map.get(temp.toString()));
                else result.append("?");
            }
            i++;
        }
        return result.toString();
    }
}