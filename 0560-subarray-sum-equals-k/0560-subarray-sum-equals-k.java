class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> prefixSum = new HashMap<>();
        int result = 0;
        int currentSum = 0;

        prefixSum.put(0,1);

        for(int num:nums){
            currentSum += num;
            int diff = currentSum - k;
            result += prefixSum.getOrDefault(diff,0);
            prefixSum.put(currentSum, prefixSum.getOrDefault(currentSum,0)+1);
        }
        return result;
    }
}