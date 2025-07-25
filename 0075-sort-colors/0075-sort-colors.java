class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int l=0;
        int r= nums.length - 1;
        while(i<=r){
            if(nums[i] == 0){
                swap(nums, i, l);
                l++;
            }
            else if(nums[i] == 2){
                swap(nums, i, r);
                r--;
                i--;
            }
            i++;
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}