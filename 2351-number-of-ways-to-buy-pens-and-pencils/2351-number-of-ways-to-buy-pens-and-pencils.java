class Solution {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long result=0;
        long penCost=0;
        while(penCost<=total){
            long remaining = total-penCost;
            long pencilPossibility = remaining/cost2 + 1;
            result += pencilPossibility;
            penCost += cost1;
        }
        return result;
    }
}