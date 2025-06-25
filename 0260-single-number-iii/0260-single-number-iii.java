class Solution {
    public int[] singleNumber(int[] nums) {
        int size = nums.length;
        int xorValue = 0;
        for(int i=0; i<size; i++){
            xorValue ^= nums[i];
        }
        int lowestBit = xorValue & (-xorValue); // taking 2's complement value
        int[] result = new int[2];
        for(int num : nums){
            if((lowestBit & num) == 0){
                result[0] = result[0]^num;
            }
            else{
                result[1] = result[1]^num;
            }
        }
        return result;
    }
}