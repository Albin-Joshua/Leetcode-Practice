class Solution {
    public int dominantIndex(int[] nums) {
        int maxNum = 0;
        int maxIndex = 0;
        int secMax = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>maxNum){
                int temp = maxNum;
                maxNum = nums[i];
                maxIndex = i;
                secMax = temp;
            }
            else if(nums[i]>secMax){
                secMax = nums[i];
            }
        }
        if((secMax*2)>maxNum){
            return -1;
        }
        return maxIndex;
    }
}