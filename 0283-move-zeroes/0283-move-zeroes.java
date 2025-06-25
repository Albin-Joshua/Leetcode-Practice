class Solution {
    public void moveZeroes(int[] nums) {
        int l = -1;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i] == 0){
                l=i;
                break;
            }
        }
        if(l==-1) return;
        for(int r = l+1; r<len; r++){
            if(nums[r] != 0){
                nums[l] = nums[r];
                nums[r] = 0;
                l++;
            }
        }
        return;
    }
}