class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum=0;
        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        double max = sum/k;
        int i=0;
        int j=k;
        while(j<n){
            sum = sum-nums[i]+nums[j];
            max = Math.max(max, sum/k);
            i++;
            j++;
        }
        return max;
    }
}