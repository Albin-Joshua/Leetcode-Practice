class Solution {
    public int missingNumber(int[] nums) {
        int size = nums.length;
        int result = 0;
        for(int i=0; i<size; i++){
            result = result^nums[i]^i;
        }
        return result^size;
    }
}