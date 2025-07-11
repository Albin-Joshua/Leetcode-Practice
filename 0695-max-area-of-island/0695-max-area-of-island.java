class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int max = 0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    int area = dfs(i,j,grid,visited);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }

    public static int dfs(int i, int j, int[][] grid, boolean[][] visited){
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]==0 || visited[i][j])return 0;
        visited[i][j] = true;

        return 1
        + dfs(i-1,j,grid,visited)
        + dfs(i+1,j,grid,visited)
        + dfs(i,j-1,grid,visited)
        + dfs(i,j+1,grid,visited);
    }
}