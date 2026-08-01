class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix[0].length;
        int m = matrix.length;
        int size = 0;
        int topmin = 0;
        int topmax = n-1;
        int rightmin = 0;
        int rightmax = m-1;
        while(size < n*m){
            for(int i = topmin ; i <= topmax ; i++ ){
                list.add(matrix[rightmin][i]);
                size++;
            }
            rightmin++;
            if(topmin > topmax || rightmin > rightmax)break;

            for(int i = rightmin ; i <= rightmax ; i++ ){
                list.add(matrix[i][topmax]);
                size++;
            }
            topmax--;
            if(topmin > topmax || rightmin > rightmax)break;

            for(int i = topmax ; i >= topmin ; i-- ){
                list.add(matrix[rightmax][i]);
                size++;
            }
            rightmax--;
            if(topmin > topmax || rightmin > rightmax)break;

            for(int i = rightmax ; i >= rightmin ; i-- ){
                list.add(matrix[i][topmin]);
                size++;
            }
            topmin++;
            if(topmin > topmax || rightmin > rightmax)break;
        }
        return list;
    }
}