class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int curMin = nums[0];
        int curMax = nums[0];
        int min = nums[0];
        int max = nums[0];
        int total=nums[0];
        for(int i=1; i<nums.length; i++){
            total += nums[i];

            curMax = Math.max(curMax+nums[i], nums[i]);
            max = Math.max(max, curMax);

            curMin = Math.min(curMin+nums[i], nums[i]);
            min = Math.min(min, curMin);
        }
        return max<0 ? max : Math.max(total-min, max);
    }
}