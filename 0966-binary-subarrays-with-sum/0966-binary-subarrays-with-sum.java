class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        Map<Integer, Integer> prefix = new HashMap<>();
        prefix.put(0,1);
        int sum=0;
        int result=0;
        for(int num:nums){
            sum += num;
            int diff = sum-goal;
            result += prefix.getOrDefault(diff,0);
            prefix.put(sum, prefix.getOrDefault(sum,0)+1);
        }
        return result;
    }
}