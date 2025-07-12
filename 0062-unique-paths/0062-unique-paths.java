class Solution {
//below method if recursive method, which has TC of O(2^(m+n)), leads to TLE

    // public static int func(int i,int j,int m,int n){
    //     if(i>=m || j>=n) return 0;
    //     if(i+1==m && j+1==n) return 1;
    //     int right = func(i,j+1,m,n);
    //     int down = func(i+1,j,m,n);
    //     return right+down;
    // }

    // public int uniquePaths(int m, int n) {
    //     int ans = func(0,0,m,n);
    //     return ans;
    // }

    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0; i<m; i++){
            arr[i][0] = 1;
        }
        for(int j=0; j<n; j++){
            arr[0][j] = 1;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        return arr[m-1][n-1];
    }
}