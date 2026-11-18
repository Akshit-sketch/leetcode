class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        while(i < intervals.length && intervals[i][1] < newInterval[0]){
            res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        int start = newInterval[0];
        int end = newInterval[1]; 
        while(i < intervals.length && intervals[i][0] <= end){
            start = Math.min(start,intervals[i][0]);
            end = Math.max(end,intervals[i][1]);
            i++;
        }
        res.add(Arrays.asList(start,end));
        while(i < intervals.length){
            res.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            i++;
        }
        int result[][] = new int[res.size()][2];
        for(int j = 0 ; j < result.length ; j++){
            result[j][0] = res.get(j).get(0);
            result[j][1] = res.get(j).get(1);
        }
        return result;
    }
}