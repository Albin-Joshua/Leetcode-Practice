class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int r=0;
        int zeroCount = 0;
        int size = nums.length;
        int result = 0;
        while(r<size){
            if(nums[r]==0){
                while(zeroCount >= k){
                    if(nums[l]==0){
                        l++;
                        zeroCount--;
                    }
                    else{
                        l++;
                    }
                }
                zeroCount++;
                r++;
            }
            else{
                r++;
            }
            result = Math.max(result, r-l);
        }
        return result;
    }
}