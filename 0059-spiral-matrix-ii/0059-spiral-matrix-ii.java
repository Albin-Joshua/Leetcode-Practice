class Solution {
    public int[][] generateMatrix(int n) {
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int num=1;
        int[][] res = new int[n][n];
        while(left<=right && top<=bottom){
            for(int i=left; i<=right; i++){
                res[top][i]=num;
                num++;
            }
            top++;
            for(int j=top; j<=bottom; j++){
                res[j][right]=num;
                num++;
            }
            right--;
            if(top<=bottom){
                for(int k=right; k>=left; k--){
                    res[bottom][k]=num;
                    num++;
                }
                bottom--;
            }
            if(left<=right){
                for(int l=bottom; l>=top; l--){
                    res[l][left]=num;
                    num++;
                }
                left++;
            }
        }
        return res;
    }
}