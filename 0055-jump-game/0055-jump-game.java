class Solution {
    public boolean canJump(int[] nums) {
        int rechable = 0;
        for(int i=0; i<nums.length; i++){
            if(i>rechable){
                return false;
            }
            rechable = Math.max(rechable, i+nums[i]);
        }
        return true;
    }
}