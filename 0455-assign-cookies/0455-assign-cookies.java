class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        Arrays.sort(greed);
        Arrays.sort(size);
        int i = 0;
        int j = 0;
        while(i < greed.length && j < size.length){
            if(size[j] >= greed[i]){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i;
    }
}