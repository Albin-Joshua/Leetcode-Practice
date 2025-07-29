class Solution {
    public int tribonacci(int n) {
        int[] dp = {0,1,1};
        for(int i=3; i<=n; i++){
            int temp = dp[0] + dp[1] + dp[2];
            dp[0] = dp[1];
            dp[1] = dp[2];
            dp[2] = temp;
        }
        if(n<=2){
            return dp[n];
        }
        else{
            return dp[2];
        }
    }
}