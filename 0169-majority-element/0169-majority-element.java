class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = -1;
        for(int i : nums){
            if(count == 0){
                count++;
                candidate = i;
            }
            else{
                if(i == candidate){
                    count++;
                }
                else{
                    count--;
                }
            }
        }
        return candidate;
    }
}