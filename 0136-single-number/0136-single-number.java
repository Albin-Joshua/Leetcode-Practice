class Solution {
    public int singleNumber(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<size; i+=2){
            if(i+1 == size){
                return nums[i];
            }
            if(nums[i] != nums[i+1]){
                return nums[i];
            }
        }
        return -1;

        // int result = 0;
        // for(int i=0; i<nums.length; i++){
        //     result = result^nums[i];
        // }
        // return result;
    }
}