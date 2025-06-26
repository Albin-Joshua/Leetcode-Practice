class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int size = nums.length;
        int result = 0;
        for(int i=0; i<size; i++){
            if(freq.containsKey(nums[i])){
                result += freq.get(nums[i]);
                freq.put(nums[i], freq.get(nums[i])+1);
            }
            else{
                freq.put(nums[i],1);
            }
        }
        return result;

        // int count = 0;
        // int size = nums.length;
        // for(int i=0; i<size-1; i++){
        //     for(int j=i+1; j<size; j++){
        //         if(nums[i] == nums[j]){
        //             count++;
        //         }
        //     }
        // }
        // return count;
    }
}