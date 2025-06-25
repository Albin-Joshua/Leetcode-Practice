class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int actualSum = (n*(n+1))/2;
        int requiredSum = 0;
        for(int num : nums){
            requiredSum += num;
        }
        return actualSum-requiredSum;
    }
}