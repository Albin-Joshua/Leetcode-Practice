class Solution {
    public int numberOfSubmatrices(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[n][2];
        int res=0;
        for(char[] row:grid){
            int s0=0; // count of x in every row
            int s1=0; // count of y in every row
            for(int i=0; i<n; i++){
                if(row[i]=='X') dp[i][0]++;
                else if(row[i]=='Y') dp[i][1]++;
                
                s0 += dp[i][0];
                s1 += dp[i][1];

                if(s0>0 && s0==s1) res++;
            }
        }
        return res;
    }
}