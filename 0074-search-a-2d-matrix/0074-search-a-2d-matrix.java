class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int s = 0;
        int e = row*col-1;
        while (s<=e){
            int m = (s+e)/2;
            int r = m/col;
            int c = m%col;
            if(matrix[r][c] == target){
                return true;
            }
            else if(matrix[r][c]<target){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return false;
    }
}