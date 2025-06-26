class Solution {
    public long minimumCost(String s) {
        long cost = 0;
        int size = s.length();

        for(int i=1; i<size; i++){
            if(s.charAt(i-1) != s.charAt(i)){
                cost += Math.min(i, size-i);
            }
        }
        return cost;
    }
}