class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0]==1) return -1;

        int m = grid.length;
        int n = grid[0].length;

        int[] row = {-1,-1,-1,0,1,1,1,0};
        int[] col = {-1,0,1,1,1,0,-1,-1};
        boolean[][] visited = new boolean[m][n];
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0,0,1});
        visited[0][0] = true;

        while(!q.isEmpty()){
            int[] temp = q.poll();
            int row1 = temp[0];
            int col1 = temp[1];
            int dist = temp[2];

            if(row1==m-1 && col1==n-1){
                return dist;
            }

            for(int i=0; i<8; i++){
                int newrow = row1 + row[i];
                int newcol = col1 + col[i];

                if(isvalid(newrow, newcol, m, n, grid, visited)){
                    visited[newrow][newcol] = true;

                    q.offer(new int[]{newrow, newcol, dist+1});
                }
            }
        }
        return -1;
    }
    public boolean isvalid(int i, int j, int m, int n, int[][] grid, boolean[][] visited){
        if(i>=0 && j>=0 && i<n && j<m && grid[i][j]==0 && !visited[i][j]) return true;
        else return false;
    }
}