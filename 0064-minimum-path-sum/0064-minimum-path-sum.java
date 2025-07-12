class Solution {
    public static int dfs(int i, int j, int[][] grid, int[][] dp){
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(i==0 && j==0) return grid[0][0];
        if(dp[i][j]!=-1) return dp[i][j];
        return dp[i][j]=grid[i][j]+Math.min(dfs(i-1,j,grid,dp),dfs(i,j-1,grid,dp));

    }
    
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp = new int[m][n];
        for(int[] row:dp){
            Arrays.fill(row, -1);
        }
        return dfs(m-1, n-1, grid, dp);
    }


    // public int minPathSum(int[][] grid) {
    //     int m = grid.length;
    //     int n = grid[0].length;
    //     for(int i=1; i<n; i++){
    //         grid[0][i] += grid[0][i-1]; 
    //     }
    //     for(int j=1; j<m; j++){
    //         grid[j][0] += grid[j-1][0];
    //     }
    //     for(int i=1; i<m; i++){
    //         for(int j=1; j<n; j++){
    //             grid[i][j] += Math.min(grid[i][j-1],grid[i-1][j]);
    //         }
    //     }
    //     return grid[m-1][n-1];
    // }
}