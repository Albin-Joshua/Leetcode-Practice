class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;
        int currMax = 0;
        int currMin = 0;
        int max = nums[0];
        int min = nums[0];
        for(int i=0; i < nums.length; i++){
            total+=nums[i];
            currMax = Math.max(nums[i], currMax+nums[i]);
            currMin = Math.min(nums[i], currMin+nums[i]);
            max = Math.max(currMax, max);
            min = Math.min(currMin, min);
        }
        return max<0 ? max : Math.max(total-min, max);
    }
}