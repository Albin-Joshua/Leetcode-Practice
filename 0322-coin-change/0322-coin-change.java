class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] minCost = new int[amount+1];
        Arrays.fill(minCost, amount+1);
        minCost[0]=0;
        for(int i=1; i<=amount; i++){
            for(int j=0; j<coins.length; j++){
                if(i-coins[j] >=0){
                    minCost[i] = Math.min(minCost[i], 1+minCost[i-coins[j]]);
                }
            }
        }
        return minCost[amount] != amount+1 ? minCost[amount] : -1;
    }
}