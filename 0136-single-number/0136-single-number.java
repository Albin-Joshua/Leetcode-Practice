class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];
        }
        return result;

        // int size = nums.length;
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int n: nums){
        //     map.put(n, map.getOrDefault(n,0)+1);
        // }
        // for(int i=0; i<size; i++){
        //     if(map.get(nums[i])==1){
        //         return nums[i];
        //     }
        // }
        // return -1;

        // int size = nums.length;
        // Arrays.sort(nums);
        // for(int i=0; i<size; i+=2){
        //     if(i+1 == size){
        //         return nums[i];
        //     }
        //     if(nums[i] != nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;


    }
}