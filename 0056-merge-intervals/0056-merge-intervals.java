class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        List<List<Integer>> res = new ArrayList<>();
        int last = intervals[0][1];
        int start = intervals[0][0];
        for(int i = 1 ; i < intervals.length ; i++){
            if(intervals[i][0] <= last){
                last = Math.max(intervals[i][1],last);
            }
            else{
                res.add(Arrays.asList(start,last));
                start = intervals[i][0];
                last = intervals[i][1];
            }
        }
        res.add(Arrays.asList(start, last));
        int result[][] = new int[res.size()][2];
        for(int i = 0 ; i < res.size() ; i++){
            result[i][0] = res.get(i).get(0);
            result[i][1] = res.get(i).get(1);
        } 
        return result;
    }
}